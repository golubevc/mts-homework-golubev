package Lesson3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InvalidAnimalException {
/*            CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
            createAnimalService.createAnimal();

            CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
            createAnimalServiceImpl.createAnimal(5);
            createAnimalServiceImpl.createAnimal();*/

            SearchServiceImpl searchServiceimpl = new SearchServiceImpl();
            searchServiceimpl.checkLeapYearAnimal(Animal);


        }
    }