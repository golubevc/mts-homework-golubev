package Lesson3;
import java.time.LocalDate;

public interface SearchService {
    default void checkLeapYearAnimal(Animal) throws InvalidAnimalException, InvalidAnimalBirthDateException{

    }
}