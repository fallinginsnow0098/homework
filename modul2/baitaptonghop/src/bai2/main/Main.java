package bai2.main;

import bai2.manager.BillManager;
import bai2.manager.CustomerManager;
import bai2.model.Customer;

import java.util.Scanner;

public class Main {
    private static final CustomerManager customerManager = new CustomerManager();
    private static final BillManager billManager = new BillManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu -----------------------");
            System.out.println("1. Manager Customer --------");
            System.out.println("2. Manager Customer's Bill--");
            System.out.println("0. Exit --------------------");
            System.out.println("Enter your choice!!!!!!!!!!!");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    menuCustomer();
                    break;
                case 2:
                    menuBill();
                    break;
            }
        }while (choice!=0);
    }
    public static void menuCustomer(){
        int choice1;
        do {
            System.out.println("Customer Manager Menu");
            System.out.println("1. Creat new customer's information");
            System.out.println("2. Delete customer's information by Code ");
            System.out.println("3. Show all customer's information");
            System.out.println("4. Show a customer's information searching by Code");
            System.out.println("0. Get out of this fucking menu");
            System.out.println("Your choice is ??");
            choice1 = scanner.nextInt();
            switch (choice1){
                case 1:
                    System.out.println(customerManager.creatCustomer());
                    break;
                case 2:
                    System.out.println("Enter electric code");
                    int deleteCode = scanner.nextInt();
                    customerManager.deleteByCode(deleteCode);
                    break;
                case 3:
                    customerManager.displayAllCustomer();
                    break;
                case 4:
                    System.out.println("Enter electric code you want to find");
                    int showCode = scanner.nextInt();
                    customerManager.displayACustomer(showCode);
                    break;
            }
        } while (choice1!=0);
    }
    public static void menuBill(){
        int choice2;
        do {
            System.out.println("Bill Manager Menu");
            System.out.println("1. Creat new bill");
            System.out.println("2. Show all bill and customer's information");
            System.out.println("3. Show a customer's detail by code");
            System.out.println("4. Pay a bill by code");
            System.out.println("Your choice is ??");
            choice2 = scanner.nextInt();
            switch (choice2){
                case 1:
                    System.out.println("Enter customer's electric code");
                    int eCode = scanner.nextInt();
                    Customer customer = customerManager.getCustomerInformation(eCode);
                    if (customer != null){
                        System.out.println(billManager.creatBill(customer));
                    } else {
                        System.out.println("That's not exist!!!");
                    }
                    break;
                case 2:
                    billManager.displayAllBill();
                    break;
                case 3:
                    System.out.println("Enter customer's electric code");
                    int showCode = scanner.nextInt();
                    billManager.showBill(showCode);
                    break;
                case 4:
                    System.out.println("Enter customer's electric code");
                    int payCode = scanner.nextInt();
                    System.out.println("You have to pay: ");
                    System.out.println(billManager.payBill(payCode));
                    break;
            }
        } while (choice2 != 0);
    }
}
