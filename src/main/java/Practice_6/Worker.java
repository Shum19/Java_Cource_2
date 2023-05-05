package Practice_6;

import java.util.SortedMap;

public class Worker {
    private String name;
    private int age;
    private int cabinetNum;
    public Worker (String name, int age){
            this.name = name;
            this.age = age;
    }

    public Worker(String name) {
        this.name = name;
    }

    public Worker(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (age > 0 && age < 70){
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
        else {
            return "Wrong age";
        }
    }
}
