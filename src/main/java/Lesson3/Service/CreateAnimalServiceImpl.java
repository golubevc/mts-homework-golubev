package Lesson3.Service;
import Lesson3.Model.*;

import java.util.*;

public class CreateAnimalServiceImpl implements CreateAnimalService{

    public Map<String, List<Animal>> createAnimal(int n) {
        Map<String, List<Animal>> animalsMap = new HashMap<>();
        Random  r = new Random();
        List<Animal> animal = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int animalType = r.nextInt(3);
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

            String animalName = animal.get(i).getName();
            if (!animalsMap.containsKey(animalName)) {
                animalsMap.put(animalName, new ArrayList<>());
            }
            animalsMap.get(animalName).add(animal.get(i));
            System.out.println(animal.get(i));
        }
        return animalsMap;



   /* public void createAnimal(int n) {
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
*/
}