package manager;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void createStudent(){
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        String address = scanner.nextLine();
        System.out.println("NHập điểm trung bình");
        double averagePoint = scanner.nextDouble();
        scanner.nextLine();
        Student student = new Student(name, age, address, averagePoint);
        studentList.add(student);
        System.out.println(student);
    }
    public void deleteStudentByName(){
        Student deleteStudent = null;
        System.out.println("Nhập vào tên sinh viên cần xóa");
        String deleteName = scanner.nextLine();
        for (Student st : studentList) {
            if (st.getName().equals(deleteName)){
                deleteStudent = st;
            }
        }
        studentList.remove(deleteStudent);
    }
    public void updateStudentByName(){
        Student updateStudent = null;
        System.out.println("Nhập tên sinh viên muốn sửa");
        String editName = scanner.nextLine();
        for (Student st : studentList) {
            if (st.getName().equals(editName)){
                updateStudent = st;
            }
        }
        int index = studentList.indexOf(updateStudent);
        try {
            assert updateStudent != null;
            System.out.println("Nhập tên mới");
            String updateName = scanner.nextLine();
            System.out.println("Nhập tuổi mới");
            int updateAge = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập địa chỉ mới");
            String updateAddress = scanner.nextLine();
            System.out.println("Nhập điểm trung bình mới");
            double updateAveragePoint = scanner.nextDouble();
            updateStudent.setName(updateName);
            updateStudent.setAge(updateAge);
            updateStudent.setAddress(updateAddress);
            updateStudent.setAveragePoint(updateAveragePoint);
            updateStudent = new Student(updateName, updateAge, updateAddress, updateAveragePoint);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        studentList.set(index, updateStudent);
    }
    public void displayAllStudent(){
        studentList.forEach(System.out::println);
    }
    public void averagePointHigherThan75(){
        List<Student> students = new ArrayList<>();
        for (Student st : studentList) {
            if(st.getAveragePoint() >= 7.5){
                students.add(st);
            }
        }
        students.forEach(System.out::println);
    }
    public void typeOfStudent(){
        
    }
}
