package Lesson3.Service;
import Lesson3.Model.Animal;
import Lesson3.Model.AnimalFactory;

import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService{
    public void createAnimal(int n) {
        System.out.println("Метод 2 --- createAnimal(int n)");
        Random  r = new Random();
        Animal[] animal = new Animal[n];
        for (int i = 0; i < n; i++) {
            animal[i] = AnimalFactory.createRandomAnimal();
            System.out.println(animal[i]);
        }
        }
    @Override
    public void createAnimal() {
        System.out.println("Метод3 --- createAnimal Override");
        Animal[] animal = new Animal[10];
        int i = 0;
        do {
            animal[i] = AnimalFactory.createRandomAnimal();
            System.out.println(animal[i]);
            i++;
        } while (i< animal.length);
    }
}