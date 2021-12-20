import java.util.*;

public class AnimalManager {
    private final Set<Animal> animalSet;
    private final Scanner scanner = new Scanner(System.in);
    public AnimalManager(){
        this.animalSet = new LinkedHashSet<>();
    }
    public void searchAnimalByName(){
        System.out.println("Enter a name");
        String searchName = scanner.nextLine();
        for (Animal animal : animalSet) {
            if (animal.getName().equals(searchName));
        }
    }
    public Animal deleteAnimalByName(){
        System.out.println("Enter a name");
        String deleteName = scanner.nextLine();
        for (Animal animal : animalSet) {
            if (animal.getName().equals(deleteName)){
                return animal;
            }
        }
        return null;
    }
    public void addAnimal(Animal animal){
        animalSet.add(animal);
    }
    public void displayAll() {
        for (Animal animal : animalSet) {
            System.out.println(animal);
        }
    }
    public Animal creatAnimal(Scanner scanner, int choice){
        scanner.nextLine();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter weight");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        switch (choice){
            case 1:
                return new Dog(name,age,weight);
            case 2:
                return new Cat(name,age,weight);
            case 3:
                return new Mouse(name, age, weight);
        }
        return null;
    }

}
