package Lesson3;

public class Cat extends Pet {
    private String name;
    private String color;

    public Cat(String breed, String name, double cost, String character) {
        super(breed, name, cost, character);
    }

    public Cat() {
        super();
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
    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public void setCharacter(String character) {

    }

    public void breed() {
    }
}