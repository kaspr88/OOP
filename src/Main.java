import family_tree.FamilyTree;
import human.Node;
import writable.FileHandler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree FamilyTree = new FamilyTree();
        FileHandler fh = new FileHandler();
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
        FamilyTree.sortBirthDay();
        System.out.println(FamilyTree.getHumanInfo());
        fh.save(FamilyTree, "src/family_tree.FamilyTree.out");
        family_tree.FamilyTree familyTree = (FamilyTree) fh.load("src/family_tree.FamilyTree.out");

    }
}