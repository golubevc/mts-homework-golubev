package Lesson3;
import java.time.LocalDate;

public interface SearchService {
    void checkLeapYearAnimal(Animal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException;

    void checkLeapYearAnimal() throws InvalidAnimalException, InvalidAnimalBirthDateException;
}