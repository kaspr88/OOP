
package human;

        import human.Human;

        import java.util.Comparator;

public class HumanConporatorBirthDay implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthDay().compareTo(o2.getBirthDay());
    }
}