package Lesson3.Model;

import java.time.LocalDate;

public class Humster extends Pet {
    public Humster() {
        name = "Хомячелло";
    }
    public LocalDate birthDate;

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
