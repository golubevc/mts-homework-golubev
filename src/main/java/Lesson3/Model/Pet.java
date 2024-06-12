package Lesson3.Model;


import java.time.LocalDate;

public abstract class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character, LocalDate birthDate) {
        super(breed,
                name,
                cost,
                character,
                birthDate);
    }

    @Override
    public abstract Pet();

    @Override
    public abstract Pet();

    public LocalDate getBirthday(){ return this.birthDate; }

    protected Pet() {
    }

}
