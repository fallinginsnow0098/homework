package bai2.manager;

import bai2.model.Bill;
import bai2.model.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BillManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Bill> billList ;
    public BillManager(){
        this.billList = new ArrayList<>();
    }
    public Bill creatBill(Customer customer){
        System.out.println("Enter old eletric number");
        double preNumber = scanner.nextDouble();
        System.out.println("Entere new electric number");
        double newNumber = scanner.nextDouble();
        Bill bill = new Bill(customer, preNumber, newNumber);
        billList.add(bill);
        return bill;
    }
    public void displayAllBill(){
        HashSet<Customer> customerHashSet = new HashSet<>();
        for (Bill b: billList) {
            customerHashSet.add(b.getCustomer());
        }
        for (Bill b: billList) {
            System.out.println(b);
        }

    }
    public void showBill(int electricCodeShow){
        for (Bill b: billList ) {
            if (b.getCustomer().getElectricCode() == electricCodeShow){
                System.out.println(b);
            }
        }
    }
    public double payBill(int electricCodePay){
        ArrayList<Bill> billPay = new ArrayList<>();
        double cash = 0;
        for (Bill b: billList ) {
            if (b.getCustomer().getElectricCode() == electricCodePay){
                cash = ( b.getNextElectricNumber() - b.getPreElectricNumber() ) * 750;
                billPay.add(b);
            }
        }
        billList.removeAll(billPay);
        return cash;
    }
}
