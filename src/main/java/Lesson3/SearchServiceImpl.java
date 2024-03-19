package Lesson3;
import java.util.Objects;
import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {
    LocalDate today = LocalDate.now();
    public void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        if (animal == null) {
            throw new InvalidAnimalException("на вход пришло некорректный объект животного" + today);
        } else if (animal.getBirthDate() == null) {
            throw new InvalidAnimalException(Animal.getName());
        } else if (animal.getBirthDate().isLeapYear()) System.out.println(Animal.getName() + " был рожден в високосный год ");
        else {
            System.out.println(Animal.getName() + " был рожден в невисокосный год ");
        }
    }
}