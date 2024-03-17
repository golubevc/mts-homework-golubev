package Lesson3;

public interface CreateAnimalService {
    default void createAnimal(){
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