package btvn.bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class BookManager {
    public static double getAvgScienceBook(Book[] listBook){
        double sum = 0;
        int count = 0 ;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof Science){
                sum += listBook[i].getPrice();
                count++ ;
            }
        }
        return ( sum / count ) ;
    }

    public static void findBookByAuthor(Scanner scanner,Book[] listBook){
        System.out.println("Nhập tác giả sách muốn tìm: ");
        String inputAuthor;
        inputAuthor = scanner.nextLine();
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof Science) {
                if ( ( (Author) listBook[i]).getBookAuthor().equals(inputAuthor) ){
                    System.out.println(listBook[i]);
                }
            }
        }
    }
    public static void findBookByType(Scanner scanner,Book[] listBook){
        System.out.println("Nhập thể loại sách muốn tìm: ");
        String inputType;
        inputType = scanner.nextLine();

        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof Science) {
                if ( ( (Science) listBook[i]).getBookType().equals(inputType) ){
                    System.out.println(listBook[i]);
                }
            }
        }
    }

    public static Book findMaxPrice(Book[] listBook) {
        double maxPrice = listBook[0].getPrice();
        int index = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].getPrice() > maxPrice) {
                maxPrice = listBook[i].getPrice();
                index = i;
            }
        }
        return listBook[index];
    }

    public static Book findMinPrice(Book[] listBook) {
        double minPrice = listBook[0].getPrice();
        int index = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].getPrice() < minPrice) {
                minPrice = listBook[i].getPrice();
                index = i;
            }
        }
        return listBook[index];
    }

    public static double priceBookList(Book[] listBook) {
        double sumPrice = 0;
        for (Book s : listBook) {
            sumPrice += s.getPrice() * s.getQuantity();
        }
        return sumPrice;
    }

    public static void displayBookList(Book[] listBook) {
        for (Book b : listBook) {
            System.out.println(b);
        }
    }

    public static void creatBookList(Scanner scan, Book[] listBook) {
        for (int i = 0; i < listBook.length; i++) {
            System.out.println("Nhập cuốn sách thứ " + (i + 1) + ": ");
            System.out.println("Chọn sách muốn nhập: ");
            System.out.println("1. Sách khoa học");
            System.out.println("2. Sách tiểu thuyết");

            int choice = scan.nextInt();

            if (choice == 1) {
                listBook[i] = creatScienceBook(scan);
            } else if (choice == 2) {
                listBook[i] = creatAuthorBook(scan);
            } else {
                System.out.println("Error 404");
            }
        }
    }

    public static Science creatScienceBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách : ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá tiền : ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng : ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập thể loại : ");
        String bookType = scanner.nextLine();
        return new Science(name, price, quantity, date, bookType);
    }

    public static Author creatAuthorBook(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên sách : ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá tiền : ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng : ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày xuất bản YY/MM/DD: ");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tên tác giả : ");
        String bookAuthor = scanner.nextLine();
        return new Author(name, price, quantity, date, bookAuthor);
    }
}
