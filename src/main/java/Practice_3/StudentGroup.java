package Practice_3;

import Home_Task_3.Teacher;
import java.util.*;

public class StudentGroup {
    private List<Integer> groupNumber;

    private Map < String, List<Integer> > map;
    private int counter;

    public StudentGroup() {
        this.groupNumber = new ArrayList<>();
        this.map = new HashMap<>();
        this.counter = 0;

    }
    public void addStudentGroup(Teacher teacher, int numberGroup){
        if (this.map.containsKey(teacher.getSurname())){
            this.groupNumber.add(numberGroup);
        }else {
            this.groupNumber = new ArrayList<>();
            this.groupNumber.add(numberGroup);
            this.map.putIfAbsent(teacher.getSurname(), this.groupNumber);
        }
    }

    public String toString(){
        return map.toString();
    }
    public List<Integer> getGroupNumber (String surname){
        return map.get(surname);
    }
    public int size(){
        return map.size();
    }
    public List <String> getSurnames(){
        return map.keySet().stream().toList();
    }


}

