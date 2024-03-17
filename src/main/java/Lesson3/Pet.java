package Lesson3;


public abstract class Pet extends AbstractAnimal {
    public Pet(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    protected Pet() {
    }

    public String getCharacter() {
        return character;
    }
}
