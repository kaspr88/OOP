package human;

import family_tree.FamilyTreeGen;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable, FamilyTreeGen {
    private LocalDate birthDay;
    private LocalDate dateOfDeath;
    private String name;
    private Human mother;
    private Human father;
    private List<String> childrens;
    public LocalDate getDateOfDeath() {
        return dateOfDeath;
    }

    public Human(LocalDate birthDay, String name, Human father, Human mother) {
        this.birthDay = birthDay;
        this.name = name;
        childrens = new ArrayList<String>();
        if (mother != null) {
            this.mother = mother;
        }
        if (father != null) {
            this.father = father;
        }
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getDateOfDeath(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        year = date.getYear();
        dateOfDeath = date;
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human(LocalDate birthDay, String name) {
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
