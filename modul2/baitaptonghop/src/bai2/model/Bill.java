package bai2.model;

public class Bill {
    private Customer customer ;
    private double preElectricNumber;
    private double nextElectricNumber;

    public Bill() {
    }

    public Bill(Customer customer, double preElectricNumber, double nextElectricNumber) {
        this.customer = customer;
        this.preElectricNumber = preElectricNumber;
        this.nextElectricNumber = nextElectricNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPreElectricNumber() {
        return preElectricNumber;
    }

    public void setPreElectricNumber(double preElectricNumber) {
        this.preElectricNumber = preElectricNumber;
    }

    public double getNextElectricNumber() {
        return nextElectricNumber;
    }

    public void setNextElectricNumber(double nextElectricNumber) {
        this.nextElectricNumber = nextElectricNumber;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", preElectricNumber=" + preElectricNumber +
                ", nextElectricNumber=" + nextElectricNumber +
                '}';
    }
}
