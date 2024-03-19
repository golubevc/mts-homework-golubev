package Lesson3;

import java.time.LocalDate;

public class Dog extends Pet {

    public Dog(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
