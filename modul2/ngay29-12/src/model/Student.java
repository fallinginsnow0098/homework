package model;

import java.io.Serializable;

public class Student extends Human implements Serializable {
    private double averagePoint;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double averagePoint) {
        super(name, age, gender, address);
        this.averagePoint = averagePoint;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student[" +
                "| name: " + super.getName() +
                "| age: " + super.getAge() +
                "| gender: " + super.getGender() +
                "| address: " + super.getAddress() +
                "| averagePoint: " + getAveragePoint() + "]";
    }
}
