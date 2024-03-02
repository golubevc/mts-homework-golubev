import Interface.Animal;

public class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    protected String character;

    @Override
    public void character() {

    }

    @Override
    public void breed() {

    }

    @Override
    public void name() {

    }

    @Override
    public void cost() {

    }
}





