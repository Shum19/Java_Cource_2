package Home_Task_3;
/**К коду с семинара добаить класс Teacher и возможность итерации и компорации для него.
 * Так же для учебной группы добавить преподавателя(У группы может быть только один
 * преподаватель, у проподавателя сколько угодно групп)
 *
 * Комментарий: Созданы два пакета Practice_3  и Home_Work_3
 * в Practice_3 добавлены классы с занятия и некоторые методы добавлены для вывода таблицы также
 * методы из пакета Practice_3 применяются в пакете Home_Work_3 и наоборот поэтому необходимо скачать два пакета так
 * они зависимы.
 */

import Practice_3.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeTaskThirdLesson {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John", "Johnson", 10);
        Teacher teacher2 = new Teacher("David", "Caprman", 5);
        Teacher teacher3 = new Teacher("Gragory", "Grog", 7);


        List<Teacher> teachers = new ArrayList<>();

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        TeacherIterator tItr = new TeacherIterator(teachers);
        while (tItr.hasNext()){
            System.out.println(tItr.next());
        }
        System.out.println();
        Collections.sort(teachers, new TeacherComparator());
        tItr = new TeacherIterator(teachers);
        while (tItr.hasNext()){
            System.out.println(tItr.next());
        }
/**В блоке ниже есть ошибка, не могу понять в чем дело
 * В данной реализации код работает с тем результатом который мне нужен
 * но если понменять порядок то напрмер в строку sG.addStudentGroup(teacher2, 503);
 * заменить teacher2 на teacher1 то номер группы добовляется все равно к teacher2.
 * И не могу понять где ошибка.
 */
        StudentGroup sG = new StudentGroup();
        sG.addStudentGroup(teacher1, 305);
        sG.addStudentGroup(teacher2, 115);
        sG.addStudentGroup(teacher2, 503);
        sG.addStudentGroup(teacher3, 112);
        sG.addStudentGroup(teacher3, 116);
        sG.addStudentGroup(teacher3, 114);

        System.out.println();
        System.out.println(sG);

        System.out.println();
        System.out.println(sG.getSurnames());

        System.out.println();
        System.out.println(sG.getGroupNumber(teacher2.getSurname()));

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setNameSurnameAge("Ivan", "Ivanov", 20);
        student1.setId(1);
        student1.setYearOfEducation(3);
        student1.setProfession("Engineer");
        student1.setNumberOfGroup(305);
        student1.setAverageScore(4.6);
        student1.setTeacher(sG);

        student2.setNameSurnameAge("Petr", "Petrov", 18);
        student2.setId(2);
        student2.setYearOfEducation(1);
        student2.setProfession("Manager");
        student2.setNumberOfGroup(112);
        student2.setAverageScore(3.7);
        student2.setTeacher(sG);

        student3.setNameSurnameAge("Sidorov", "Sergei", 22);
        student3.setId(3);
        student3.setYearOfEducation(5);
        student3.setProfession("Medecine");
        student3.setNumberOfGroup(503);
        student3.setAverageScore(4.6);
        student3.setTeacher(sG);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentGroupIterator group = new StudentGroupIterator(students);
        group.printTable();










    }
}
