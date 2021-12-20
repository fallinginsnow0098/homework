public class Cat extends Animal implements AnimalAction {

    public Cat() {
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 5;
    }

    @Override
    public String makeSound() {
        return "MeowMeow";
    }
    public void catchMouse(){
        System.out.println("Catch OK");
    }
}
