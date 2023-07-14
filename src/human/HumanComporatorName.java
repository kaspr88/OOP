package human;


import family_tree.FamilyTreeGen;

import java.util.Comparator;

public class HumanComporatorName<E extends FamilyTreeGen> implements Comparator<E>  {

    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
