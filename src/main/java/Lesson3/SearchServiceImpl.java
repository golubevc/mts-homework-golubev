package Lesson3;
import java.util.Objects;
import java.time.LocalDate;

class SearchServiceImpl implements SearchService {
    LocalDate today = LocalDate.now();
    @Override
    public void checkLeapYearAnimal(Animal Animal) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        if (Objects.isNull(Animal)) {
            throw new InvalidAnimalException("на вход пришло некорректный объект животного" + today);
        } else if (Animal.getBirthDate() == null) {
            throw new InvalidAnimalException(Animal.getName());
        } else if (Animal.getBirthDate().isLeapYear()) System.out.println(Animal.getName() + " был рожден в високосный год ");
        else {
            System.out.println(Animal.getName() + " был рожден в невисокосный год ");
        }
    }
}