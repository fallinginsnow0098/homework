package btvn.bai1;

import java.time.LocalDate;

public class Author extends Book {
    private String bookAuthor;

    public Author() {
    }

    public Author(String name, double price, int quantity, LocalDate publicationDate, String bookAuthor) {
        super(name, price, quantity, publicationDate);
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String toString() {
        return "NovelBook { name=" + getName() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", publicationDate=" + getPublicationDate() +
                ", author=" + getBookAuthor() + "}";
    }
}
