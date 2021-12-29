package bai3.manager;

import bai3.model.Card;
import bai3.model.Student;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Scanner;

public class CardManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Card> cards = new ArrayList<>();

    public Card creatCard(Student student){
        Card card = null;
        try {
            System.out.println("Nhập ngày mượn");
            LocalDate startDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-LL-yyy"));
            System.out.println("Nhập số ngày mượn");
            int day = scanner.nextInt();
            LocalDate finishDate = startDate.plusDays(day);
            System.out.println("Nhập thể loại sách");
            String bookType = scanner.nextLine();
            card = new Card(student, startDate, finishDate, bookType);
            cards.add(card);
        } catch (Exception e){
            System.out.println("Nhập sai rồi ! Nhập lại đi");
            creatCard(student);
        }
        return card;
    }
    public void displayByName(int searchId){
        boolean checkName = true;
        for (Card c : cards) {
            if (c.getStudent().getStudentNumber() == searchId){
                System.out.println(c);
                checkName = false;
            }
        }
        if (checkName){
            System.out.println("Không tìm thấy!");
        }
    }
    public ArrayList<Card> listBackupCard(){
        ArrayList<Card> cardArrayList = null;
        Card card = null;
        for (Card c : cards) {
            if (LocalDate.now().getDayOfYear() - c.getOutDate().getDayOfYear() >= 0){
                card = c;
            }
        }
        assert false;
        cardArrayList.add(card);
        return cardArrayList;
    }
}
