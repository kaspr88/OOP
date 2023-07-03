import java.time.LocalDate;

public class Human {
    LocalDate birthDay;
    LocalDate dateOfDeath;
    String name;

    public Human(LocalDate birthDay, String name) {
        this.birthDay = birthDay;
        this.name = name;
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
        LocalDate date = LocalDate.of(year,month,day);
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        year = date.getYear();
        dateOfDeath = date;
        return dateOfDeath;
    }

    public void setDateOfDeath(LocalDate dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }





}
