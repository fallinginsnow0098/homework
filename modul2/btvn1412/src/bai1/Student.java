package bai1;

public class Student{
    private static int count = 0;

    private String name ;
    private int age ;
    private String gender ;
    private String address ;
    private double pga ;

    public Student() {
    }

    public Student( String name, int age, String gender, String address, double pga) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.pga = pga;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPga() {
        return pga;
    }

    public void setPga(double pga) {
        this.pga = pga;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", pga=" + pga +
                '}';
    }

}
