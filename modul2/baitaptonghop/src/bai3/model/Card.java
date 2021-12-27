package bai3.model;

import java.time.LocalDate;

public class Card {
    private static int value = 0;
    private Student student;
    private int cardNumber;
    private LocalDate inDate;
    private LocalDate outDate;
    private String bookType;

    public Card() {
    }

    public Card(Student student, LocalDate inDate, LocalDate outDate, String bookType) {
        this.student = student;
        this.cardNumber = ++value;
        this.inDate = inDate;
        this.outDate = outDate;
        this.bookType = bookType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getInDate() {
        return inDate;
    }

    public void setInDate(LocalDate inDate) {
        this.inDate = inDate;
    }

    public LocalDate getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDate outDate) {
        this.outDate = outDate;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return  "sinh viên: " + student +
                ", mã phiếu =" + cardNumber +
                ", ngày mượn =" + inDate +
                ", ngày trả =" + outDate +
                ", loại sách ='" + bookType ;
    }
}
