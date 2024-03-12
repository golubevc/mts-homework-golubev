package Lesson3;

import java.util.Random;


public interface CreateAnimalService {
    Random random = new Random();//https://stackoverflow.com/questions/26085454/code-with-random-number-generator-and-loop

    default void createDefaultAnimals() throws IllegalStateException {
        int number = 0;
        while (number < 10) {
            Animal animal = switch (random.nextInt(4)) {
                case 1 -> new Wolf();
                case 2 -> new Shark();
                case 3 -> new Dog();
                case 4 -> new Cat();
                default -> throw new IllegalStateException("некорректное значение: " + random.nextInt(4));
           /* switch (random.nextInt(4)) {
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
                    throw new IllegalStateException("Unexpected value: " + random.nextInt(4));

            */};
            System.out.println(animal);
            number++;
        }

    }
}
