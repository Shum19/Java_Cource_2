package Practice_3;

import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int yearOfEducation;
    private int id;
    private int numberOfGroup;
    private String profession;
    private double averageScore;
    private String teacher;

    @Override
    public String toString() {
        String id = String.format("|%-5s|", this.id);
        String name = String.format("%-20s|", this.name);
        String surname = String.format("%-20s|", this.surname);
        String age = String.format("%-5d|", this.age);
        String yearOfEduc = String.format("%-20s|", this.yearOfEducation);
        String numOfGroup = String.format("%-8s|", this.numberOfGroup);
        String profession = String.format("%-20s|", this.profession);
        String  averageScore = String.format("%-20s|", this.averageScore);
        String teacher = String.format("%-24s|", this.teacher);
        return id + name + surname + age + yearOfEduc + numOfGroup + profession + averageScore + teacher;
    }

    public void setNameSurnameAge(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setYearOfEducation(int yearOfEducation) {
        this.yearOfEducation = yearOfEducation;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }
    public void setAverageScore(double averageScore){
        this.averageScore = averageScore;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public int getYearOfEducation() {
        return this.yearOfEducation;
    }

    public int getId() {
        return this.id;
    }

    public int getNumberOfGroup() {
        return this.numberOfGroup;
    }

    public String getProfession() {
        return this.profession;
    }
    public double getAverageScore(){return this.averageScore;}

    public void setTeacher(StudentGroup sG) {
        int i = 0;
        List<String> teachers = sG.getSurnames();
        while (i < sG.size()){
            String teacher = teachers.get(i);
            List <Integer> groups = sG.getGroupNumber(teacher);
            for (int j = 0; j < groups.size(); j++){
                if (this.numberOfGroup == groups.get(j)){
                    this.teacher = teacher;
                }
            }
            i++;
        }
    }

    public String getTeacher() {
        return teacher;
    }
}
