public class Mouse extends Animal implements AnimalAction{

    public Mouse() {
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 1;
    }

    @Override
    public String makeSound() {
        return "CitCit";
    }
    public void eat(){
        System.out.println("Eat rice");
    }
}
