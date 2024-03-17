package Lesson3;

public class Predator extends AbstractAnimal {

    public Predator(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public Predator() {
        name = "Хищник";
    }
}