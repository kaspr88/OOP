
package human;

        import family_tree.FamilyTreeGen;
        import human.Human;

        import java.util.Comparator;

public class HumanComporatorBirthDay<E extends FamilyTreeGen> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        return o1.getBirthDay().compareTo(o2.getBirthDay());
    }
}