package Lesson3;


import java.time.LocalDate;

public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed,
                name,
                cost,
                character,
                birthDate);
    }
    public LocalDate getBirthday(){ return this.birthDate; }

    protected Pet() {
    }

}
