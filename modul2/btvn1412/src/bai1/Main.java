package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hs");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManager studentManager = new StudentManager(students);

        int choice ;
        do {
            System.out.println("_____Menu_____");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Hiển thị sinh viên có điểm cao nhất");
            System.out.println("4. Hiển thị sinh viên có điểm thấp nhất");
            System.out.println("5. Xóa một sinh viên theo tên");
            System.out.println("6. Tìm kiếm sv theo tên");
            System.out.println("7. Hiển thị các sinh viên theo giới tính");
            System.out.println("8. Sắp xếp danh sách sinh viên theo điểm trung bình tăng dần");
            System.out.println("9. Exit Menu");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập điểm TB");
                    double pga = scanner.nextDouble();
                    Student student = new Student(name, age, gender, address, pga);
                    studentManager.addStudent(student);
                    break;
                case 2:
                    studentManager.displayAllStudent();
                    break;
                case 3:
                    studentManager.displayHighestPGA();
                    break;
                case 4:
                    studentManager.displayLowestPGA();
                    break;
                case 5:
                    studentManager.deleteStudent(scanner);
                    break;
                case 6:
                    System.out.println("Nhập vào tên sinh viên cần tìm");
                    String searchName = scanner.nextLine();
                    studentManager.searchByName(searchName);
                    break;
                case 7:
                    System.out.println("Nhập vào giới tính sinh viên cần hiển thị");
                    String searchGender = scanner.nextLine();
                    studentManager.displayByGender(searchGender);
                    break;
                case 8:
                    System.out.println("Sắp xếp sinh viên theo thứ tự điểm trung bình tăng dần là: ");
                    studentManager.sortPGA();
                    break;
                case 9:
                    System.exit(9);
                    break;
            }

        } while (choice != 0 );
    }
}
