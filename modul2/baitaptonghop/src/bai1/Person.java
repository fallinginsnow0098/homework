package bai1;

public class Person {
    private String name;
    private String birthDay;
    private int personNumber;

    public Person() {
    }

    public Person(String name, String birthDay, String personNumber) {
        this.name = name;
        this.birthDay = birthDay;
        this.personNumber = Integer.parseInt(personNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = Integer.parseInt(personNumber);
    }
    public void displayPerson() {
        System.out.printf("%-15S", name);
        System.out.printf("%-15.2s", birthDay);
        System.out.printf("%-15d", personNumber);

    }
}
