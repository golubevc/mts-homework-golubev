package Lesson3.Model;

import java.time.LocalDate;
import java.util.*;

public class AnimalFactory {
    private final static Random random = new Random();

    public static Animal createRandomAnimal() {
//        int AnimalType = random.nextInt(5);
//        return switch (AnimalType){
//            case 1 -> new Cat("Мяв", "Котик" ,  random.nextDouble(), "Особенность кота", LocalDate.now());
//            case 2 -> new Wolf("АУФ", "Волк" , random.nextDouble(), "Голодный как тварь", LocalDate.now());
//            case 3 -> new Humster("Пук", "Хомяк" , random.nextDouble(), "Живой или мертвый", LocalDate.now());
//            case 4 -> new Shark("Буль", "Акула" , random.nextDouble(), "Плавает", LocalDate.now());
//            default -> new Dog("АУФ", "Собака", random.nextDouble(), "Позитивный", LocalDate.now());
//        };
        public static Map<String, List<Animal>> createRandomAnimal() {
            Map<String, List<Animal>> animals = new HashMap<>();
            int catCount = random.nextInt(5);

            for (int i = 0; i < catCount; i++) {
                animals.put("Cat", Arrays.asList(new Cat("Мяв", "Котик" ,  random.nextDouble(), "Особенность кота", LocalDate.now())));
            }

            int wolfCount = random.nextInt(3);
            for (int i = 0; i < wolfCount; i++) {
                animals.put("Wolf", Arrays.asList(new Wolf("АУФ", "Волк" , random.nextDouble(), "Голодный как тварь", LocalDate.now())));
            }

            int humsterCount = random.nextInt(2);
            for (int i = 0; i < humsterCount; i++) {
                animals.put("Humster", Arrays.asList(new Humster("Пук", "Хомяк" , random.nextDouble(), "Живой или мертвый", LocalDate.now())));
            }
            return (Animal) animals;
        }

    }
}