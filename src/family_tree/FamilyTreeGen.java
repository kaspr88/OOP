package family_tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface FamilyTreeGen<E> extends Serializable {


    E getFather();
    E getMother();
    String getName();
    LocalDate getDateOfDeath();
    LocalDate getBirthDay();


}
