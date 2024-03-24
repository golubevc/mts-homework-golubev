package Lesson3.Exception;

public class InvalidAnimalBirthDateException
        extends Exception{
    public InvalidAnimalBirthDateException (String message) {
        super("У животного типа "  + " не указана дата рождения: " + message);
    }
}
