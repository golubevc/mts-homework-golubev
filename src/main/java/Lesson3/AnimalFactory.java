package Lesson3;

import java.util.Random;

public class AnimalFactory {
    private final static Random random = new Random();

    public static Animal createRandomAnimal() {
        int AnimalType = random.nextInt(2);
        return switch (AnimalType){
            case 0 -> new Cat("Мяу", "Рандомно созданный котяра", random.nextDouble(), "Добряк");
            case 1 -> new Dog("Гав", "Барсик", random.nextDouble(), "Хороший характер");
            case 2 -> new Wolf("АУФ", "Волчара1" , random.nextDouble(), "Голодный как тварь");
            default ->  new Dog("АУФ", "Собака", random.nextDouble(), "Позитивный");
        };
    }
}
