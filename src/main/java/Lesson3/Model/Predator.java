package Lesson3.Model;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {
    public Predator() {
    }

    public Predator(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }


    public LocalDate getBirthDate(){
        return birthDate;
    }
}