package Home_Task_3;

public class Teacher {
    private String name;
    private String surname;
    private int experience;
    public Teacher(String name, String surname, int experience){
        this.name = name;
        this.surname = surname;
        this.experience = experience;

    }

    public String getName() {
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public int getExperience() {
        return experience;
    }
    public String toStringForTable(){
        String initials = getSurname() +" " + getName().substring(0,1 );
        return String.format("%118s|", initials);
    }

    public String toString(){
        return String.format("Name: %s/ Surname: %s/ Experience: %d", name, surname, experience);
    }
}
