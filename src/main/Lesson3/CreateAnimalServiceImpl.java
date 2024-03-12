package Lesson3;
import java.util.Random;
import java.util.Scanner;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    Random random = new Random();
    public void createAnimals(int AnimalsNumber){
        for (int i = 0; i < AnimalsNumber; i++){
            Animal animal = new Dog();
            switch (random.nextInt(4)) {
                case 1:
                    animal = new Wolf();
                    break;
                case 2:
                    animal = new Shark();
                    break;
                case 3:
                    animal = new Dog();
                    break;
                case 4:
                    animal = new Cat();
                    break;
                default:
                    throw new IllegalStateException("Неожиданное значение: " + random.nextInt(4));
            }
            System.out.println(animal);
        }
    }

    public void createAnimals(){
        int numberOfAnimal = 5;
        int count = 0;
        do {
            new Cat();
            Animal animal = switch (random.nextInt(4)) {
                case 1 -> new Wolf();
                case 2 -> new Shark();
                case 3 -> new Dog();
                case 4 -> new Cat();
                default -> animal;
            };
            System.out.println(animal);
            count++;
        } while (count < numberOfAnimal);

    }
}