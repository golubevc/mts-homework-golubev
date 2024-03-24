package Lesson3;

import Lesson3.Exception.InvalidAnimalBirthDateException;
import Lesson3.Exception.InvalidAnimalException;
import Lesson3.Model.Animal;
import Lesson3.Model.Cat;
import Lesson3.Service.CreateAnimalService;
import Lesson3.Service.CreateAnimalServiceImpl;
import Lesson3.Service.SearchServiceImpl;

public class Main {
    public static void main(String[] args) throws InvalidAnimalException, InvalidAnimalBirthDateException {

        CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimal();

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(5);
        createAnimalServiceImpl.createAnimal();


        try {
            SearchServiceImpl searchserviceimpl = new SearchServiceImpl();
            Animal MainCat = new Cat("МЯУ", "Котяра", 1233, "Неплохой", null);
            searchserviceimpl.checkLeapYearAnimal(MainCat);
        } catch (InvalidAnimalBirthDateException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAnimalException e) {
            System.out.println(e.getMessage());
        }
    }
}