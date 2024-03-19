package Lesson3;

import java.time.LocalDate;

public class Cat extends Pet {


    public Cat(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public Cat() {
        super();
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';


    }
}