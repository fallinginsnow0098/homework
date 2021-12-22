package bai1;

public class Hotel {
    private int stayDay;
    private String roomType;
    private int price;

    public Hotel() {
    }

    public Hotel(String stayDay, String roomType, int price) {
        this.stayDay = Integer.parseInt(stayDay);
        this.roomType = roomType;
        this.price = price;
    }

    public int getStayDay() {
        return stayDay;
    }

    public void setStayDay(String stayDay) {
        this.stayDay = Integer.parseInt(stayDay);
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void displayHotel() {
        System.out.printf("%-15S", stayDay);
        System.out.printf("%-15.2s", roomType);
        System.out.printf("%-15d", price);
        System.out.println();
    }

}
