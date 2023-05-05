package Practice_6;

public class Cat {
    private String name;
    private  String breed;
    private int age;
    private int weight;
    private boolean isGoodMood;

    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isGoodMood() {
        return this.isGoodMood;
    }

    public void setGoodMood(boolean goodMood) {
        this.isGoodMood = goodMood;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isGoodMood=" + isGoodMood +
                ", color='" + color + '\'' +
                '}';
    }
}
