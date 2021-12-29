package manager;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/data/students.csv";
    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = readFileCSV(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean checkAll(int age, double average) {
        return (age >= 18 && age <= 60 && !(average < 0) && !(average > 10));
    }

    public String getGenderByChoice(int choice) {
        String gender = "";
        switch (choice) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
        }
        return gender;
    }

    public void addStudent() {
        System.out.println("Input name");
        String name = scanner.nextLine();
        System.out.println("Input age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input gender by choice");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        int gender = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input address");
        String address = scanner.nextLine();
        System.out.println("Input average point");
        double averagePoint = scanner.nextDouble();
        scanner.nextLine();

        if (checkAll(age, averagePoint) && !getGenderByChoice(gender).equals("")) {
            students.add(new Student(name, age, getGenderByChoice(gender), address, averagePoint));
            writeFileCSV(students, PATH_NAME);
            System.out.println("Add successfully - " + name);
        } else {
            System.err.println("Data entry error, check again");
        }
    }

    public Student editStudent(String name) {
        Student editStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editStudent = student;
            }
        }
        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Input name");
            String editName = scanner.nextLine();
            System.out.println("Input age");
            int editAge = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input gender by choice");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. Other");
            int editGender = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input address");
            String editAddress = scanner.nextLine();
            System.out.println("Input average point");
            double editAveragePoint = scanner.nextDouble();
            scanner.nextLine();
            editStudent.setName(editName);
            editStudent.setAge(editAge);
            editStudent.setGender(getGenderByChoice(editGender));
            editStudent.setAddress(editAddress);
            editStudent.setAveragePoint(editAveragePoint);
            if (checkAll(editAge, editAveragePoint) && !getGenderByChoice(editGender).equals("")) {
                students.add(new Student(editName, editAge, getGenderByChoice(editGender), editAddress, editAveragePoint));
                writeFileCSV(students, PATH_NAME);
                System.out.println("Edit successfully - " + editName);
            } else {
                System.err.println("Data entry error, check again");
            }
        }
        return editStudent;
    }

    public Student deleteStudent(String name) {
        Student deletedStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                deletedStudent = student;
            }
        }
        if (deletedStudent != null) {
            students.remove(deletedStudent);
            writeFileCSV(students, PATH_NAME);
            System.out.println("Delete successfully - " + name);
        }
        return deletedStudent;
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("List students is empty now");
        } else {
            students.forEach(System.out::println);
        }
    }

    public void displayByPoint() {
        if (students.isEmpty()) {
            System.out.println("List students is empty now");
        }
        for (Student student : students) {
            if (student.getAveragePoint() >= 7.5) {
                System.out.println(student);
            }
        }
    }

    public void displayByType() {
        if (students.isEmpty()) {
            System.out.println("List students is empty now");
        }
        for (Student student : students) {
            double point = student.getAveragePoint();
            String name = student.getName();
            if (point > 8) {
                System.out.println(name + "-" + point + "-" + "GOOD");
            } else if (point > 6) {
                System.out.println(name + "-" + point + "-" + "PRETTY");
            } else if (point > 4) {
                System.out.println(name + "-" + point + "-" + "NORMAL");
            } else {
                System.out.println(name + "-" + point + "-" + "BAD");
            }
        }
    }

    public void writeFileCSV(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getName() + "," + student.getAge() + "," + student.getGender() + "," +
                        student.getAddress() + "," + student.getAveragePoint() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Student> readFileCSV(String path){
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));
            }
        } catch (IOException e ){
            System.err.println(e.getMessage());
        }
        return students;
    }
}
