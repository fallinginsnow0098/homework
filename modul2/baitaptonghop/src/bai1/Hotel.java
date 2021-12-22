package bai1;

public class Hotel {
    private String stayDay;
    private String roomType;
    private int price;

    public Hotel() {
    }

    public Hotel(String stayDay, String roomType, int price) {
        this.stayDay = stayDay;
        this.roomType = roomType;
        this.price = price;
    }

    public void displayHotel() {
        System.out.printf("%-15S", stayDay);
        System.out.printf("%-15.2s", roomType);
        System.out.printf("%-15d", price);
        System.out.println();
    }

}
