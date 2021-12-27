package bai3.model;

import java.time.LocalDate;

public class Student {
    private String name;
    private int studentNumber;
    private LocalDate birthDay;
    private String className;

    public Student() {
    }

    public Student(String name, int studentNumber, LocalDate birthDay, String className) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.birthDay = birthDay;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Sinh viên: " +
                "tên ='" + name + '\'' +
                ", mã sv =" + studentNumber +
                ", ngày sinh ='" + birthDay + '\'' +
                ", tên lớp = '" + className +"'";
    }
}
