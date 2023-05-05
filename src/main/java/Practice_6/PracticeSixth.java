package Practice_6;

public class PracticeSixth {
    public static void main(String[] args) {
        Cat cat1 = CatBuilder.getInstance().setName("Fox").setBreed("Fold").setAge(2).setWeight(3).setColor("Grey").
                setGoodMood(true).build();
        System.out.println(cat1);
    }
}
