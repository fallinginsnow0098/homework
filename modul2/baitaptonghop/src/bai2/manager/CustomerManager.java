package bai2.manager;

import bai2.model.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Customer> customers ;

    public CustomerManager(){
        this.customers = new ArrayList<>();
    }
    public Customer creatCustomer(){
        System.out.println("Enter full name!");
        String name = scanner.next();
        System.out.println("Enter address ");
        String address = scanner.next();
        System.out.println("Enter electric code");
        double electricCode = scanner.nextDouble();
        for (Customer c: customers) {
            if (c.getElectricCode() == electricCode){
                System.out.println("Electric code is duplicate!! ");
                return null;
            }
        }
        Customer customer = new Customer(name,address,electricCode);
        customers.add(customer);
        return customer;
    }
    public void deleteByCode(int deleteCode){
        Customer deleteCustomer = null;
        for (Customer c: customers) {
            if (c.getElectricCode() == deleteCode){
                deleteCustomer = c;
            }
        }
        boolean check = customers.remove(deleteCustomer);
        if (check) {
            System.out.println("Delete complete!");
        } else {
            System.out.println("Delete un-complete");
        }
    }
    public void displayAllCustomer(){
        for (Customer c: customers) {
            System.out.println(c);
        }
    }
    public void displayACustomer(int displayCode){
        Customer customer = null;
        for (Customer c: customers) {
            if (c.getElectricCode() == displayCode){
                customer = c;
            }
        }
        if (customer != null){
            System.out.println(customer);
        } else {
            System.out.println("Code is not exist");
        }
    }
    public Customer getCustomerInformation(int electricCode){
        Customer customer = null;
        for (Customer c: customers) {
            if (c.getElectricCode() == electricCode){
                customer = c;
            }
        }
        return customer;
    }
}
