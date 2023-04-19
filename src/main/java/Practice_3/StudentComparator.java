package Practice_3;

import java.util.Comparator;

/** Создать класс СтудентКомпаратор реализующий интерфейс Comparator
 *  - Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
 *
 */
public class StudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student student, Student anotehrStudent) {
        if (student.getAverageScore() > anotehrStudent.getAverageScore()) return -1;
        if (student.getAverageScore() < anotehrStudent.getAverageScore()) return 1;
        if(student.getName().length() > anotehrStudent.getName().length()) return -1;
        if (student.getName().length() < anotehrStudent.getName().length()) return 1;
        return 0;
    }
}
