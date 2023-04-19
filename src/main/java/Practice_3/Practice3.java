package Practice_3;

import java.util.ArrayList;
import java.util.List;


/** - Создать класс Студент
 *  - Создать класс УчебнаяГруппаИтератор
 *  - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
 *  - Реализовать его контракты (включая удаление)
 */
public class Practice3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setNameSurnameAge("Ivan", "Ivanov", 20);
        student1.setId(1);
        student1.setYearOfEducation(3);
        student1.setProfession("Engineer");
        student1.setNumberOfGroup(305);
        student1.setAverageScore(4.6);

        student2.setNameSurnameAge("Petr", "Petrov", 18);
        student2.setId(2);
        student2.setYearOfEducation(1);
        student2.setProfession("Manager");
        student2.setNumberOfGroup(112);
        student2.setAverageScore(3.7);

        student3.setNameSurnameAge("Sidorov", "Sergei", 22);
        student3.setId(3);
        student3.setYearOfEducation(5);
        student3.setProfession("Medecine");
        student3.setNumberOfGroup(503);
        student3.setAverageScore(4.6);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        StudentGroupIterator group = new StudentGroupIterator(students);
        group.printTable();
    }
}
