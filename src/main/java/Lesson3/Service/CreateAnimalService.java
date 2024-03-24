package Lesson3.Service;

import Lesson3.Model.Animal;
import Lesson3.Model.AnimalFactory;
import Lesson3.Exception.InvalidAnimalException;

public interface CreateAnimalService {
    default void createAnimal() throws InvalidAnimalException {
        System.out.println("Метод 1 ---CreateAnimalService");
        Animal[] animal = new Animal[10];
        int i = 0;
        while (i < animal.length) {
            animal[i] = AnimalFactory.createRandomAnimal();
            System.out.println(AnimalFactory.createRandomAnimal());
            i++;
        }
    }
}