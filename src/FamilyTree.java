import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Node> humanList;


    public  FamilyTree() {
        humanList = new ArrayList<>();

    }

    public void addHuman(Node human) {
        humanList.add(human);

    }

    public String getHumanInfo() {
        StringBuilder info = new StringBuilder();
        for (Human human:humanList) {
            info.append(human);
            info.append("\n");
        }

        return info.toString();
    }

}
