package model;

import my_interface.ActionAnimal;

public class Cat extends Animal implements ActionAnimal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    public Cat(){}
    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "MeowMeow";
    }
    public void catchMouse(){
        System.out.println("Catch mouse");
    }
    public void display() {
        System.out.printf("%-20s", "Cat");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
