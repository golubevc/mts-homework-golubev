package Lesson3;

import java.time.LocalDate;

public abstract class Dog extends Pet {
    public String color;
    public LocalDate birthDate;

    public Dog(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
        this.color = color;
    }

    public Dog() {
        this.color = color;
    }
}
