package bai2.model;

public class Customer {
    private String name;
    private String address;
    private int electricCode;

    public Customer() {
    }

    public Customer(String name, String address, double electric) {
        this.name = name;
        this.address = address;
        this.electricCode = (int) electric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getElectricCode() {
        return electricCode;
    }

    public void setElectric(double electric) {
        this.electricCode = (int) electric;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", electric=" + electricCode +
                '}';
    }
}
