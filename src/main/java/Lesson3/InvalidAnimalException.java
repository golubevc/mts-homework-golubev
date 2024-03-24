package Lesson3;

public class InvalidAnimalException extends Exception{
    public InvalidAnimalException(String message) {
        super("Пустой объект по имени" + " " + message);
    }
}
