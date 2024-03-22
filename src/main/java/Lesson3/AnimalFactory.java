package Lesson3;

import java.time.LocalDate;
import java.util.Random;

public class AnimalFactory {
    private final static Random random = new Random();

    public static Animal createRandomAnimal() {
        int AnimalType = random.nextInt(2);
        return switch (AnimalType){
            case 2 -> new Wolf("АУФ", "Волчара1" , random.nextDouble(), "Голодный как тварь", LocalDate.now());
            default ->  new Dog("АУФ", "Собака", random.nextDouble(), "Позитивный", LocalDate.now());
        };
    }
}
