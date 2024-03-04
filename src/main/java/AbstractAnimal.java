import Interface.Animal;

public abstract class AbstractAnimal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;


    abstract public String getBreed() {
        return breed;
    }

    abstract public void setBreed(String breed) {
        this.breed = breed;
    }

    abstract public String getName() {
        return name;
    }

    abstract public void setName(String name) {
        this.name = name;
    }


    abstract public Double getCost() {
        return cost;
    }

    abstract public void setCost(Double cost) {
        this.cost = cost;
    }


    abstract public String getCharacter() {
        return character;
    }

    abstract public void setCharacter(String character) {
        this.character = character;
    }


    @Override
    public void character() {

    }

    @Override
    public void breed() {
    }
}






