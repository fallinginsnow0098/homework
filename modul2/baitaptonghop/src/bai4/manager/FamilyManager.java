package bai4.manager;

import bai4.model.Family;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyManager {
    ArrayList<Family> families = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Family creatFamily(){
        System.out.println("Nhập số thành viên");
        int personQuantity = scanner.nextInt();
        Family family = new Family(personQuantity);
        families.add(family);
        return family;
    }
    public void displayFamily(int houseNumber){
        Family family = null;
        for (Family f : families) {
            if (f.getHouseNumber() == houseNumber){
                family = f;
            }
        }
        if (family != null){
            System.out.println(family);
        } else {
            System.out.println("Số nhà không có trong hệ thống");
        }
    }
    public void displayAll(){
        for (Family family : families) {
            System.out.println(family);
        }
    }
    public Family getHouseNumber(int houseNumber){
        Family family = null;
        for (Family f : families) {
            if (f.getHouseNumber() == houseNumber){
                family = f;
            }
        }
        return family;
    }

}
