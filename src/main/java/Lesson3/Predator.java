package Lesson3;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {

    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character);
    }
    public Predator() {
    }

    @Override
    public LocalDate getBirthDate() {
        return null;
    }
}