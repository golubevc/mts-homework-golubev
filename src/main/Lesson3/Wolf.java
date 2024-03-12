package Lesson3;

public class Wolf extends Predator {
    protected String breed;
    protected String name;
    protected Double cost;


    public Wolf(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public Wolf() {
        super();
    }
};