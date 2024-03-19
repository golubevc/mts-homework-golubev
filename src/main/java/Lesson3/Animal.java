package Lesson3;

import javax.lang.model.element.Name;
import java.time.LocalDate;

public interface Animal {

    String getBreed();
    static String getName();
    double getCost();
    String getCharacter();
    static LocalDate getBirthDate();

}
