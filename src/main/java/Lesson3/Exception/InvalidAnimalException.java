package Lesson3.Exception;

public class InvalidAnimalException
        extends RuntimeException{
    public InvalidAnimalException(String message) {
        super("Пустой объект по имени" + " " + message);
    }
}
