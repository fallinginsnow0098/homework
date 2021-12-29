package main;

import ReadWriteFile.IOFile;
import manager.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        IOFile<Student> studentIOFile = new IOFile<>();
        List<Student> students = new ArrayList<>();

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo thông tin học sinh mới");
            System.out.println("2. Xóa thông tin sinh viên theo tên");
            System.out.println("3. Sửa thông tin sinh viên theo tên");
            System.out.println("4. Hiển thị tất cả thông tin sinh viên");
            System.out.println("5. Hiển thị thông tinh sinh viên có điểm TB trên 7.5");
            System.out.println("6. Ghi thông tin ra file");
            System.out.println("7. Đọc thông tin từ file");
            System.out.println("0. Thoát");
            System.out.println("Chọn đi bạn ơi!");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    studentManager.createStudent();
                    break;
                case 2:
                    studentManager.deleteStudentByName();
                    break;
                case 3:
                    studentManager.updateStudentByName();
                    break;
                case 4:
                    studentManager.displayAllStudent();
                    break;
                case 5:
                    studentManager.averagePointHigherThan75();
                    break;
                case 6:

                    break;
                case 7:

                    break;

                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
