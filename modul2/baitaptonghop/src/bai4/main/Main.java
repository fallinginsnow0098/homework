package bai4.main;

import bai4.manager.FamilyManager;
import bai4.manager.PersonManager;
import bai4.model.Family;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PersonManager personManager = new PersonManager();
    private static final FamilyManager familyManager = new FamilyManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Quản lí người");
            System.out.println("2. Quản lí hộ gia đình");
            System.out.println("Chọn");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    menuPerson();
                    break;
                case 2:
                    menuFamily();
                    break;
            }
        } while (choice != 0);
    }
    public static void menuPerson(){
        int choice1;
        do {
            System.out.println("Menu person");
            System.out.println("1. Tạo thông tin 1 người");
            System.out.println("2. Hiển thị hết");
            System.out.println("3. Hiển thị tất cả những người trên 80 tuổi");
            System.out.println("Chọn");
            choice1 = scanner.nextInt();
            switch (choice1){
                case 1:
                    System.out.println("Nhập vào số nhà");
                    int houseNumber = scanner.nextInt();
                    Family family = familyManager.getHouseNumber(houseNumber);
                    personManager.creatPerson(family);
                    break;
                case 2:
                    personManager.displayAll();
                    break;
                case 3:
                    System.out.println("Thông tin những người trên 80 tuổi: ");
                    personManager.displayPersonOver80();
                    break;
            }
        } while (choice1 != 0);
    }
    public static void menuFamily(){
        int choice2;
        do {
            System.out.println("Menu family");
            System.out.println("1. Tạo thông tin 1 hộ gia đình");
            System.out.println("2. Hiển thị hộ gia đình theo số nhà");
            System.out.println("3. Hiển thị tất cả các hộ gia đình");
            System.out.println("Chọn");
            choice2 = scanner.nextInt();
            switch (choice2){
                case 1:
                    System.out.println(familyManager.creatFamily());
                    break;
                case 2:
                    System.out.println("Nhập số nhà");
                    int searchNumber = scanner.nextInt();
                    familyManager.displayFamily(searchNumber);
                    break;
                case 3:
                    familyManager.displayAll();
                    break;
            }
        } while (choice2 != 0);
    }
}
