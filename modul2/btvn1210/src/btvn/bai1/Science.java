package btvn.bai1;

import java.time.LocalDate;

public class Science extends Book {
    private String bookType;

    public Science() {
    }

    public Science(String name, double price, int quantity, LocalDate publicationDate, String bookType) {
        super(name, price, quantity, publicationDate);
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "ScienceBook { name=" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", publicationDate=" + getPublicationDate() +
                ", book type =" + getBookType() + "}";
    }
}
