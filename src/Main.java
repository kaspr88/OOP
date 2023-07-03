import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        FamilyTree FamilyTree = new FamilyTree();
        Node father = new Node(LocalDate.of(1989, 2, 13), "Иванов Иван");
        Node mother = new Node(LocalDate.of(1993, 6, 22), "Иванова Василиса");
        Node children1 = new Node(LocalDate.of(2015, 4, 23), "Иванов Василий", father, mother);
        Node children2 = new Node(LocalDate.of(2023, 10, 16), "Иванова Алиса", father, mother);

        FamilyTree.addHuman(mother);
        FamilyTree.addHuman(father);

        FamilyTree.addHuman(children1);
        FamilyTree.addHuman(children2);

        father.childrenAdd(children1);
        father.childrenAdd(children2);

        mother.childrenAdd(children1);
        mother.childrenAdd(children2);
        System.out.println(FamilyTree.getHumanInfo());

    }
}