package Home_Task_3;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher t1, Teacher t2) {
        if (t1.getExperience() < t2.getExperience()) return 1;
        else if (t1.getExperience() == t2.getExperience()) return 0;
        return -1;

    }
}
