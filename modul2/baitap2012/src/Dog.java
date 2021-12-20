public class Dog extends Animal implements AnimalAction{

    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public String makeSound() {
        return "GauGau";
    }
    public void playWithMouse(){
        System.out.println("Where is the pussy cat?!");
    }
}
