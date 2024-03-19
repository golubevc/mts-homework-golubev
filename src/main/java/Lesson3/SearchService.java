package Lesson3;
import java.time.LocalDate;

public interface SearchService {
    void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException;
}
