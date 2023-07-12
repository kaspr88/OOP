package family_tree;

import human.Human;
import human.HumanConporatorBirthDay;
import human.HumanConporatorName;
import human.Node;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Human> {
    List<Human> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public void addHuman(Node human) {
        humanList.add(human);
    }

    public String getHumanInfo() {
        StringBuilder info = new StringBuilder();
        for (Human human : humanList) {
            info.append(human);
            info.append("\n");
        }
        return info.toString();
    }

    public void sortBirthDay() {
        humanList.sort(new HumanConporatorBirthDay());
    }
    public void sortName() {
        humanList.sort(new HumanConporatorName());
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }

}
