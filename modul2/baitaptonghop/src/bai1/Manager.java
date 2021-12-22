package bai1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager {
    HashMap<Person, Hotel> hashmapManager = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addInformation(){

        System.out.println("Enter customer's name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter customer's birthday: ");
        String customerBirthDay = scanner.nextLine();
        System.out.println("Enter customer's id number");
        String customerId = scanner.nextLine();
        Person person = new Person(customerName, customerBirthDay, customerId);
        System.out.println("Enter stayed day");
        String stayDay = scanner.nextLine();
        System.out.println("Enter type of room:");
        String roomType = scanner.nextLine();
        System.out.println("Enter room's price:");
        int roomPrice = scanner.nextInt();
        scanner.nextLine();
        Hotel hotel = new Hotel(stayDay, roomType, roomPrice);
        hashmapManager.put(person, hotel);
    }
    public void display(){
        System.out.printf("%-15S%-15S%-15S%-15S%-15S%-15S","Name", "Birthday", "Customer id", "Stay day", "room type", "price");
        System.out.println();
//        Set<Map.Entry<Person, Hotel>> entrySet = control.entrySet();
        for (Map.Entry<Person, Hotel> print : hashmapManager.entrySet()) {
            print.getKey().displayPerson();
            print.getValue().displayHotel();
        }
    }
    public void deleteCustomerInformation(int personNumber){
        Person person = null;
        if (listIsEmpty()){
            for (Person p: hashmapManager.keySet()) {
                if (p.getPersonNumber() == personNumber){
                    person = p;
                }
            }
            hashmapManager.remove(person);
        } else {
            System.out.println("list is empty now!");
        }
        display();
    }
    public boolean listIsEmpty(){
        return !hashmapManager.isEmpty();
    }
    public void getMoney(int personNumber){
        if (listIsEmpty()){
            boolean check = false;
            for (Map.Entry<Person, Hotel> getMoney : hashmapManager.entrySet()) {
                if (getMoney.getKey().getPersonNumber() == personNumber){
                    check = true;
                    System.out.println("After " + getMoney.getValue().getStayDay() + " days, you have pay " + getMoney.getValue().getPrice() * getMoney.getValue().getStayDay());
                    break;
                }
            }
            if (!check){
                System.out.println("Number error");
            }
        } else {
            System.out.println("List is empty now!");
        }
    }

}
