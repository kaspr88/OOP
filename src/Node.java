import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Node extends Human implements Serializable {

    private Node mother;
    private Node father;
    private List<String> childrens;

    public Node(LocalDate birthDay, String name, Node father, Node mother) {
        super(birthDay, name);
        childrens = new ArrayList<String>();
        if (mother != null) {
            this.mother = mother;
        }
        if (father != null) {
            this.father = father;
        }
    }

    public Node getMother() {
        return mother;
    }

    public Node getFather() {
        return father;
    }

    public Node(LocalDate birthDay, String name) {
        this(birthDay, name, null, null);
    }

    public void childrenAdd(Human children) {
        childrens.add(children.getName());
    }

    public String getHumanInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Имя: " + getName());
        info.append(", Дата рождения: " + getBirthDay());
        info.append(motherInfo());
        info.append(fatherInfo());
        info.append(", Дети: " + childrens);
        return info.toString();
    }

    public String motherInfo() {
        Human mother = getMother();
        if (mother != null) {
            return ", Мать: " + mother.getName();
        }
        return ", Мать: не известна";
    }

    public String fatherInfo() {
        Human father = getFather();
        if (father != null) {
            return ", Отец: " + father.getName();
        }
        return ", Отец: не известен";
    }

    @Override
    public String toString() {
        return getHumanInfo();
    }
}
