package Lesson3.Service;
import Lesson3.Model.Animal;
import Lesson3.Exception.InvalidAnimalBirthDateException;
import Lesson3.Exception.InvalidAnimalException;

public interface SearchService {
    void checkLeapYearAnimal(Animal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException;
}
