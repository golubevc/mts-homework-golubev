package Pets;
public class Dog extends Pet {

    private String name;
    private String color;

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

    public Dog() {
        name = x;
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }

};