package Lesson3;

public class Humster extends Pet {
    private String name;
    private String color;

    public Humster(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCharacter(String character) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Cat(String x) {
        name = x;
    }

} ;
