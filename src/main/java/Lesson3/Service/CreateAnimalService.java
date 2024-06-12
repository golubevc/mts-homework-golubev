package Lesson3.Service;

import Lesson3.Model.*;
import Lesson3.Exception.InvalidAnimalException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CreateAnimalService {
    default Map<String, List<Animal>> createAnimal(){
        Map<String, List<Animal>> animalsMap = new HashMap<>();
        List<Animal> list = new ArrayList<>();
        List<Animal> animal = new ArrayList<>(10);
        int i = 0;

        while (i < animal.size()) {
            int animalType = (int)Math.round(Math.random() * 4);
            switch (animalType) {
                case 0:
                    animal.add(new Cat());
                    break;
                case 1:
                    animal.add(new Dog());
                    break;
                case 2:
                    animal.add(new Shark());
                    break;
                default:
                    animal.add(new Wolf());
            }



//    default void createAnimal() throws InvalidAnimalException {
//        System.out.println("Метод 1 ---CreateAnimalService");
//        Animal[] animal = new Animal[10];
//        int i = 0;
//        while (i < animal.length) {
//            animal[i] = AnimalFactory.createRandomAnimal();
//            System.out.println(AnimalFactory.createRandomAnimal());
//            i++;
        }
    }
}