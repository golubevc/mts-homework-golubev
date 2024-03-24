package Lesson3.Service;
import Lesson3.Exception.InvalidAnimalBirthDateException;
import Lesson3.Exception.InvalidAnimalException;
import Lesson3.Model.Animal;
import Lesson3.Model.Cat;
import Lesson3.Service.SearchServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import java.time.LocalDate;

public class SearchServiceImplTest {

    @Test
    @DisplayName("Создание Cat в високосный год")
     public void WhenCreatedCat_LeapYear() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        Animal testCat1 = new Cat("МЯВ", "Котяра", 123, "Хороший", LocalDate.parse("2024-03-24"));
        SearchServiceImpl searchService = new SearchServiceImpl();
        searchService.checkLeapYearAnimal(testCat1);
        String actualMessage = (testCat1.getName() + " был рожден в високосный год");
        String expectedMessage = ("Котяра был рожден в високосный год");
        Assertions.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    @DisplayName("Создание Cat в невисокосный год")
    public void whenCreatedCat_NotLeapYear() throws InvalidAnimalException,InvalidAnimalBirthDateException {
        Animal testCat2 = new Cat("МЯВ", "Котяра", 123, "Хороший", LocalDate.parse("2023-03-28"));
        SearchServiceImpl searchService = new SearchServiceImpl();
        String actualMessage = (testCat2.getName() + " был рожден в невисокосный год");
        String expectedMessage = "Котяра был рожден в невисокосный год";
        Assertions.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    @DisplayName("Создание Cat с null объектом")
    public void WhenCreateCat_NullObject() {
        Animal testCat4 = null;
        Assertions.assertNull(testCat4, () -> "Кот должен быть null");
    }

    @Test
    @DisplayName("Ошибка при создании Животного")
    public void whenCreateCatException() throws InvalidAnimalException {
        Animal testCat4 = null;
        SearchServiceImpl ssi = new SearchServiceImpl();
        InvalidAnimalException exception = Assertions.assertThrows(InvalidAnimalException.class, () -> ssi.checkLeapYearAnimal(testCat4));
        String expectedMessage = "Пустой объект по имени на вход пришло некорректный объект животного2024-03-24";
        System.out.println(exception.getMessage());
        String actualMessage = String.valueOf(exception.getMessage());
        Assertions.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    @DisplayName("Создание Cat с null объектом")
    public void WhenCreateCat_NotNullObject() {
        Animal testCat5 = new Cat("МЯВ", "Котяра", 123, "Хороший", LocalDate.parse("2021-02-28"));
        Assertions.assertNotNull(testCat5, () -> "Кот не должен быть null");
    }


}






