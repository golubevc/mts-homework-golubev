package Lesson3;

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
        }
        try {
            SearchServiceImpl searchserviceimpl = new SearchServiceImpl();
            Animal MainCat1 = null;
            searchserviceimpl.checkLeapYearAnimal(MainCat1);
        }catch (InvalidAnimalException e) {
            System.out.println(e.getMessage());
        }
    }
}