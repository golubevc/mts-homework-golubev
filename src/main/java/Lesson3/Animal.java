package Lesson3;

import javax.lang.model.element.Name;
import java.time.LocalDate;

public interface Animal {

    String getBreed();
    String getName();
    double getCost();
    String getCharacter();
    LocalDate getBirthDate();

}
