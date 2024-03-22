package Lesson3;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;

public class SearchServiceImplTest extends TestCase {

    SearchService searchService;

    @Test
    @DisplayName("Создание Cat в невисокосный год")
    public void whenCreatedCatNotLeapYearFalse() throws InvalidAnimalException, NullPointerException, InvalidAnimalBirthDateException {
        Animal testCat2 = new Cat("МЯВ", "Котяра", 123, "Хороший", LocalDate.now());
        SearchServiceImpl searchService = new SearchServiceImpl();
        searchService.checkLeapYearAnimal(testCat2);
    }

    @Test
    public void checkLeapYearAnimal() {
        Animal testCat3 = new Cat("МЯВ", "Котяра", 123, "Хороший", LocalDate.now());
        String expected = "Котяра был рожден в високосный год \"";

        animal.getBirthDate().isLeapYear()) System.out.println(animal.getName() + " был рожден в високосный год ");
    }
}