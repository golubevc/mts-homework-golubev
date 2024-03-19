package Lesson3;

import java.time.LocalDate;

public class Cat extends Pet {


    public Cat(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }
    public Cat() {
        this.name = name;
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
    @Override
    public LocalDate getBirthDate() {
        return null;
    }
}