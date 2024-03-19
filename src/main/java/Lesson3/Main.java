package Lesson3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args Animal Animal) throws InvalidAnimalException, InvalidAnimalBirthDateException {
        CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimal();

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(5);
        createAnimalServiceImpl.createAnimal();

        SearchServiceImpl searchserviceimpl = new SearchServiceImpl();
        searchserviceimpl.checkLeapYearAnimal();

        }
    }