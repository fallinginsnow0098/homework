package bai3.main;

import bai3.manager.CardManager;
import bai3.manager.StudentManager;
import bai3.model.Card;
import bai3.model.Student;


import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager studentManager = new StudentManager();
    private static final CardManager cardManager = new CardManager();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Quản lí sinh viên");
            System.out.println("2. Quản lí thẻ mượn sách");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    menuStudent();
                    break;
                case 2:
                    menuCard();
                    break;
            }
        } while (choice != 0);
    }
    public static void menuStudent(){
        int choice1;
        do {
            System.out.println("Menu SV");
            System.out.println("1. Thêm sv");
            System.out.println("2. Xóa sv");
            System.out.println("3. Tìm sv");
            System.out.println("4. Hiển thị hết ");
            choice1 = scanner.nextInt();
            switch (choice1){
                case 1:
                    System.out.println(studentManager.creatStudent());
                    break;
                case 2:
                    System.out.println("Nhập mã sv muốn xóa");
                    int deleteNumber = scanner.nextInt();
                    System.out.println(studentManager.deleteByNumber(deleteNumber));
                    break;
                case 3:
                    System.out.println("Nhập mã sv muốn tìm");
                    int searchNumber = scanner.nextInt();
                    System.out.println(studentManager.searchByNumber(searchNumber));
                    break;
                case 4:
                    studentManager.displayList();
                    break;
            }
        } while (choice1 != 0);
    }
    public static void menuCard(){
        int choice2;
        do {
            System.out.println("Menu card");
            System.out.println("1. Mượn sách ");
            System.out.println("2. Hiển thị sv và sách đang mượn");
            System.out.println("Nhập vào lựa chọn");
            choice2 = scanner.nextInt();
            switch (choice2){
                case 1:
                    System.out.println("Nhập vào mã sv");
                    int studentNumber = scanner.nextInt();
                    Student student = studentManager.getStudent(studentNumber);
                    if (student != null){
                        System.out.println(cardManager.creatCard(student));
                    } else {
                        System.out.println("Chưa có thông tin sv trên");
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào mã số sv");
                    int searchId = scanner.nextInt();
                    cardManager.displayByName(searchId);
                    break;
                case 3:
                    System.out.println("Danh sách học sinh phải trả sách");
                    for (Card c: cardManager.listBackupCard()) {
                        System.out.println(c);
                    }
            }
        } while (choice2 != 0);
    }
}
