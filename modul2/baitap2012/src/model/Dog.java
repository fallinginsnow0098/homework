package model;

import my_interface.ActionAnimal;

public class Dog extends Animal implements ActionAnimal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
    public Dog() {
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }
    public void watchOut(){
        System.out.println("Watching house");
    }
    public void display() {
        System.out.printf("%-20s", "Dog");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
