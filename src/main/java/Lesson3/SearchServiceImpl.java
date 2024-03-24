package Lesson3;
import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {
    public void checkLeapYearAnimal(Animal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        if (animal == null) {
            throw new InvalidAnimalException("на вход пришло некорректный объект животного" + LocalDate.now());
        } else if (animal.getBirthDate() == null) {
            throw new InvalidAnimalException(animal.getName());
        } else if (animal.getBirthDate().isLeapYear())
            System.out.println(animal.getName() + " был рожден в високосный год");
        else {
            System.out.println(animal.getName() + " был рожден в невисокосный год");
        }
    }
}