package bai4.model;

public class Family {
    private int houseNumber;
    private int personQuantity;
    private Person person;
    private static int value = 0;

    public Family() {
    }

    public Family(int personQuantity) {
        this.houseNumber = ++value;
        this.personQuantity = personQuantity;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPersonQuantity() {
        return personQuantity;
    }

    public void setPersonQuantity(int personQuantity) {
        this.personQuantity = personQuantity;
    }

    @Override
    public String toString() {
        return  " || số nhà = " + houseNumber +
                " || số thành viên = " + personQuantity ;
    }
}
