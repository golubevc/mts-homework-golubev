package Lesson3;

import Lesson3.Exception.InvalidAnimalBirthDateException;
import Lesson3.Exception.InvalidAnimalException;
import Lesson3.Model.Animal;
import Lesson3.Model.Cat;
import Lesson3.Service.CreateAnimalService;
import Lesson3.Service.CreateAnimalServiceImpl;
import Lesson3.Service.SearchServiceImpl;

public class Main {
    public static void main(String[] args) throws RuntimeException, InvalidAnimalBirthDateException {


        try {
            CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
            createAnimalService.createanimals();
        } catch (InvalidAnimalException e) {
            throw new RuntimeException(e);
        }
        try {
            SearchServiceImpl searchserviceimpl = new SearchServiceImpl();
            Animal MainCat = new Cat("МЯУ", "Котяра", 1233, "Неплохой", null);
            searchserviceimpl.checkLeapYearAnimal(MainCat);
        } catch (InvalidAnimalBirthDateException | InvalidAnimalException e) {
            System.out.println(e.getMessage());
        }
       /* try {
            CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
            createAnimalService.createAnimal(2);
        } catch (InvalidAnimalException e) {
            throw new RuntimeException(e);
        }
        try {
            CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
            createAnimalService.createAnimal();
        } catch (InvalidAnimalException e) {
            throw new RuntimeException(e);
        }*/

    }
}