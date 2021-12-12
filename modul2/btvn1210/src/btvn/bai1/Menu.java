package btvn.bai1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách");
        int size = scanner.nextInt();
        Book[] books = new Book[size];

        int choice = -1 ;
        do {
            chose();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    BookManager.creatBookList(scanner, books);
                    break;
                case 2:
                    System.out.println("Danh sách:");
                    BookManager.displayBookList(books);
                    break;
                case 3:
                    System.out.println("Tổng tiền số sách vừa nhập: ");
                    BookManager.priceBookList(books);
                    break;
                case 4:
                    BookManager.findMaxPrice(books);
                    break;
                case 5:
                    BookManager.findMinPrice(books);
                    break;
                case 6:
                    BookManager.findBookByType(scanner, books);
                    break;
                case 7:
                    BookManager.findBookByAuthor(scanner, books);
                    break;
                case 8:
                    BookManager.getAvgScienceBook(books) ;
                    break;

            }
        } while (choice != 0) ;
    }
    public static void chose() {
        System.out.println("Choice: ");
        System.out.println("* * * * * * * * * *");
        System.out.println("1. Thêm sách mới: ");
        System.out.println("2. Hiển thị danh sách vừa nhập: ");
        System.out.println("3. Tổng tiền: ");
        System.out.println("4. Tìm cuốn sách đắt nhất: ");
        System.out.println("5. Tìm cuốn sách rẻ nhất: ");
        System.out.println("6. Tìm sách theo thể loại: ");
        System.out.println("7. Tìm tên sách theo tác giả: ");
        System.out.println("8. Tính đơn giá trung bình của sách khoa học: ");
    }
}

