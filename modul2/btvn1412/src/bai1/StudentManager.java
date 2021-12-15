package bai1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager implements Comparator<Student> {
    private Student[] students ;
    private static int index = 0;

    public StudentManager() {
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student creatStudent(Scanner scanner) {
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double pga = scanner.nextDouble();
        return new Student(id,name,age,gender,address,pga);
    }
    public void addStudentList(Scanner scanner, Student[] students){
        for (int i = 0; i < students.length; i++) {
            students[i] = creatStudent(scanner);
        }
    }

    public void displayAllStudent(){

        System.out.println("Danh sách sinh viên");
        for (Student st: students) {
            boolean compareNull = st != null ;
            if (compareNull){
                System.out.println(st);
            }
            System.out.println("__________");
        }
    }
    public void displayHighestPGA(){
        double highestPGA = students[0].getPga();
        for ( Student st : students) {
            if (st.getPga() > highestPGA){
                highestPGA = st.getPga();
            }
        }
        System.out.println(highestPGA);
    }
    public void displayLowestPGA(){
        double lowestPGA = students[0].getPga();
        for ( Student st : students ) {
            if (st.getPga() < lowestPGA){
                lowestPGA = st.getPga();
            }
        }
        System.out.println(lowestPGA);
    }
    public void searchByName(String searchName){
        boolean check = false ;
        for ( Student st : students ) {
            if (st.getName().equals(searchName)){
                check = true ;
                System.out.println(st);
            }
        }
        if (!check){
            System.out.println("Không có thằng nào tên như vậy cả! Nhập lại");
        }
        System.out.println("_________");
    }
    public void displayByGender( String searchGender){
        boolean check = false ;
        for ( Student st : students ) {
            if (st.getGender().equals(searchGender)){
                check = true ;
                System.out.println(st);
            }
        }
        if (!check){
            System.out.println("Chơi bê đê đi!");
        }
    }

    public void deleteStudent (Scanner scanner){
        System.out.println("Nhập tên sinh viên muốn xóa: ");

        int count = 0 ;
        String deleteName = scanner.nextLine();
        for ( Student student : students ) {
            if (student.getName().equals(deleteName)){
                count++ ;
            }
        }
        Student[] newStudents = new Student[students.length - count];
        int index = 0;
        for ( Student student : students) {
            if (!(student.getName().equals(deleteName))){
                newStudents[index] = student;
                index++;
            }
        }
        students = newStudents;
        for ( Student st : students ) {
            System.out.println(st);
        }
    }



    public void sortPGA(){
        StudentManager studentManager = new StudentManager();
        Arrays.sort(students, studentManager);
        for ( Student st : students) {
            System.out.println(st);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getPga() > o2.getPga()) return 1;
        else if (o1.getPga() < o2.getPga()) return -1;
        else return 0;
    }
}
