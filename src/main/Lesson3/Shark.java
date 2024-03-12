package Lesson3;

public class Shark extends Predator {
    private String name;
    private String color;

    public Shark(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
