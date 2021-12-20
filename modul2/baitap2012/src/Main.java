import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add a animal");
            System.out.println("2. Display all animal");
            System.out.println("3. Search animal by name");
            System.out.println("4. Delete animal by name");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1 = scanner.nextInt();
                    do {
                        System.out.println("1. Add a dog");
                        System.out.println("2. Add a cat");
                        System.out.println("3. Add a mouse");
                        System.out.println("4.Exit");
                        System.out.println("Enter choice of animal ");

                        switch (choice1) {
                            case 1:
                                Animal dog;
                                dog = animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(dog);
                                break;
                            case 2:
                                Animal cat;
                                cat = animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(cat);
                                break;
                            case 3:
                                Animal mouse;
                                mouse = animalManager.creatAnimal(scanner, choice1);
                                animalManager.addAnimal(mouse);
                                break;
                            case 4:
                                System.exit(4);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 2:
                    animalManager.displayAll();
                    break;
                case 3:
                    animalManager.searchAnimalByName();
                    break;
                case 4:
                    animalManager.deleteAnimalByName();
                    break;
            }

        } while (choice != 0);
    }
}
