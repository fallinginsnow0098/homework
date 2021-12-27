package bai4.manager;

import bai4.model.Family;
import bai4.model.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
    ArrayList<Person> people = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Person creatPerson(Family family){
        Person person = null;
        try {
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày sinh");
            LocalDate birthDay = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println("Nhập nghề nghiệp");
            String job = scanner.nextLine();
            person = new Person(name, birthDay, job, family);
            people.add(person);
        } catch (Exception e){
            e.printStackTrace();
        }
        return person;
    }
    public void displayAll(){
        for (Person p : people) {
            System.out.println(p);
        }
    }
    public void displayPersonOver80(){
        for (Person p : people) {
            if ((LocalDate.now().getYear() - p.getBirthDay().getYear()) >= 80){
                System.out.println(p);
            }
        }
    }
}
