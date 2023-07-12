package human;

import human.Node;

import java.util.Comparator;

public class HumanConporatorName implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
