package main;

import manager.AnimalManager;
import model.Animal;
import model.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add animal");
            System.out.println("2. Delete animal by name");
            System.out.println("3. Edit animal by name");
            System.out.println("4. Display all animal by name");
            System.out.println("5. Display all animal");
            System.out.println("6. Display all dog");
            System.out.println("7. Display animal between weight");
            System.out.println("0. Exit menu");
            System.out.println("Enter choice");
            choice = scanner.nextInt();

            switch (choice){

                case 1:
                    int choice1;
                    do {
                        System.out.println("Enter your choice to add an animal");
                        System.out.println("1. Animal");
                        System.out.println("2. Dog");
                        System.out.println("3. Cat");
                        System.out.println("4. Mouse");
                        System.out.println("0. Exit");
                        choice1 = scanner.nextInt();
                        if (choice1!=0 && !animalManager.addAnimal(choice)){
                            System.out.printf("%S", "Name Error, Enter another name please");
                            System.out.println();
                        }
                    }while (choice1!= 0);
                   break;
                case 2:
                    System.out.println("Enter name to delete");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    Animal animal = animalManager.deleteAnimal(name);
                    if (animal == null){
                        System.out.println("Delete not complete");
                    } else {
                        animal.display();
                    }
                    break;
                case 3:
                    System.out.println("Enter name to edit");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    Animal animalEdit = animalManager.updateAnimal(editName);
                    if (animalEdit != null){
                        System.out.println("Edit not complete");
                    } else {
                        animalEdit.display();
                    }
                    break;
                case 4:
                    System.out.println("Enter name to display");
                    scanner.nextLine();
                    String displayName = scanner.nextLine();
                    animalManager.displayAnimal(displayName);
                    break;
                case 5:
                    System.out.println("Display all animal");
                    System.out.printf("%-20S%-20S%-20S%S", "Animal", "Name", "Age", "Weight");
                    System.out.println();
                    animalManager.displayAllAnimal();
                    break;
                case 6:
                    System.out.println("Display all dog in list");
                    System.out.printf("%-20S%-20S%-20S%S", "Animal", "Name", "Age", "Weight");
                    System.out.println();
                    ArrayList<Dog> dogs = animalManager.displayAllDog();
                    for (Dog dog : dogs) {
                        dog.display();
                        dog.makeSound();
                    }
                    break;
                case 7:
                    System.out.println("Enter weight down");
                    int weightDown = scanner.nextInt();
                    System.out.println("Enter weight up");
                    int weightUp = scanner.nextInt();
                    ArrayList<Animal> animals = animalManager.listAnimalByWeight(weightDown, weightUp);
                    System.out.println("Display all animal between weight up and weight down");
                    System.out.printf("%-20S%-20S%-20S%S", "Animal", "Name", "Age", "Weight");
                    System.out.println();
                    for (Animal ani : animals ) {
                        ani.display();
                    }
break;

            }
        }while (choice!=0);
    }
}
