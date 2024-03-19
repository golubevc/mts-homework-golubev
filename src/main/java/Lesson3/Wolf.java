package Lesson3;

import java.time.LocalDate;

public class Wolf extends Predator {
    public Wolf(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    public Wolf() {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Wolf(String ауф, String волчара1, double v, String голодныйКакТварь) {
    }
}