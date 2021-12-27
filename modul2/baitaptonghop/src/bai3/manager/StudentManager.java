package bai3.manager;

import bai3.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.*;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public Student creatStudent(){
        Student student = null;
        try {
            System.out.println("Nhập tên sv");
            String name = scanner.nextLine();
            System.out.println("Nhập mã sv");
            int studentNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập ngày sinh sv");
            LocalDate birthDay = LocalDate.parse(scanner.nextLine(), ofPattern("dd-LL-yyyy"));
            System.out.println("Nhập tên lớp");
            String className = scanner.nextLine();
            for (Student st : students) {
                if(st.getStudentNumber() == studentNumber){
                    System.out.println("Mã sv bị trùng, mời nhập lại");
                    return null;
                }
            }
            student = new Student(name,studentNumber,birthDay,className);
            students.add(student);
        } catch (Exception e){
            System.err.println("Chắc là lỗi tâm linh r!");
            creatStudent();
        }
        return student;
    }

    public Student updateByNumber(int updateNumber){
        Student studentUpdate = null;
        for (Student st : students) {
            if (st.getStudentNumber() == updateNumber){
                studentUpdate = st;
            }
        }
        if (studentUpdate != null){
            int index = students.indexOf(studentUpdate);
            System.out.println("Nhập tên sv mới");
            String nameUpdate = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhập mã sv mới");
            int studentNumberUpdate = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập ngày sinh sv mới");
            String date = scanner.nextLine();
            LocalDate birthDayUpdate = LocalDate.parse(date, ofPattern("dd-LL-yyy"));
            System.out.println("Nhập tên lớp mới");
            String classNameUpdate = scanner.nextLine();
            scanner.nextLine();
            students.set(index, studentUpdate);
        }
        return studentUpdate;
    }
    public Student deleteByNumber(int deleteNumber){
        Student student = null;
        for (Student st : students) {
            if (st.getStudentNumber() == deleteNumber){
                student = st;
            }
        }
        if (student != null){
            students.remove(student);
        }
        return student;
    }
    public Student searchByNumber(int searchNumber){
        Student student = null;
        for (Student st : students) {
            if (st.getStudentNumber() == searchNumber){
                student = st;
            }
        }
        if (student == null){
            System.out.println("Chưa nhập vào thông tin sv này!!");
        }
        return student;
    }
    public void displayList(){
//        Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()) System.out.println(iterator.next());
        for (Student student : students) System.out.println(student);
    }
    public Student getStudent(int studentNumber){
        Student student = null;
        for (Student st : students) {
            if (st.getStudentNumber() == studentNumber){
                student = st;
            }
        }
        return student;
    }

}
