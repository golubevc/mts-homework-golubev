package Lesson3;

import java.awt.image.ImagingOpException;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimal();

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(5);
        createAnimalServiceImpl.createAnimal();

        try {
            SearchServiceImpl searchserviceimpl = new SearchServiceImpl();
            Animal dog2 = new Dog();
            Animal dog3 = new Cat("МЯУ", "а", 1233, "Неплохой", null);
            searchserviceimpl.checkLeapYearAnimal(dog2);
        } catch (InvalidAnimalException e){
            System.out.println(e.getMessage());
        }
    }
}