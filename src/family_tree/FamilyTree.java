package family_tree;

import human.Human;
import human.HumanComporatorBirthDay;
import human.HumanComporatorName;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamilyTreeGen<E>> implements Serializable, Iterable<Human> {
    List<E> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public void addHuman(E human) {
        humanList.add(human);
    }

    public String getHumanInfo() {
        StringBuilder info = new StringBuilder();
        for (E human : humanList) {
            info.append(human);
            info.append("\n");
        }
        return info.toString();
    }

    public void sortBirthDay() {
        humanList.sort(new HumanComporatorBirthDay<>());
    }
    public void sortName() {
        humanList.sort(new HumanComporatorName<>());
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }

}
