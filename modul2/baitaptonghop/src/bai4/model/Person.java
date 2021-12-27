package bai4.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDay;
    private String job;
    private Family family;

    public Person() {
    }

    public Person(String name, LocalDate birthDay, String job, Family family) {
        this.name = name;
        this.birthDay = birthDay;
        this.job = job;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Person: " +
                " || tên ='" + name + '\'' +
                " || ngày sinh = " + birthDay +
                " || nghề nghiệp = " + job + "\t" +
                family.toString();
    }
}
