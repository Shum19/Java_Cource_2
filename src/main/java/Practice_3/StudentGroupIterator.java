package Practice_3;

import Home_Task_3.Teacher;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> students;
    private Teacher teacher;
    public StudentGroupIterator(List<Student> students){
        this.counter = 0;
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if(!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }

    @Override
    public void remove() {
        students.remove(students.size() - 1);
    }

    public void printTable(){
        String headId= String.format("|%-5s|", "ID");
        String headName = String.format("%-20s|","NAME");
        String headSurname = String.format("%-20s|", "SURNAME");
        String headAge= String.format("%-5s|", "AGE");
        String yearOfEducation = String.format("%-20s|", "Year of Education");
        String numberOfGroup = String.format("%-7s|", " Group №");
        String profession = String.format("%-20s|", " Profession");
        String averageScore = String.format("%-20s|", "Average Score");
        String headTeacher = String.format("%-24s|\n", "Teacher Surname&Initials");
        System.out.print(   headId + headName + headSurname + headAge  + yearOfEducation +
                numberOfGroup + profession + averageScore + headTeacher + '|' + "-".repeat(5) +
                "|" + "-".repeat(20) + '|' + "-".repeat(20) + "|" +"-".repeat(5) + '|'+
                "-".repeat(20) + '|' + "-".repeat(8) + '|' + "-".repeat(20) + '|' +
                "-".repeat(20) + '|' + "-".repeat(24) + '|' +"\n");
        int i = 0;

        while (i < students.size()){
            System.out.println(students.get(i));
            i++;
        }
    }
}
