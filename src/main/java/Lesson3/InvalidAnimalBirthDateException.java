package Lesson3;

public class InvalidAnimalBirthDateException extends Exception{
    public InvalidAnimalBirthDateException (String message) {
        super("У животного типа "  + " не указана дата рождения: " + message);
    }
}
