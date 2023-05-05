package Practice_6;

public class CatBuilder {
    private static CatBuilder instance = null;
    private Cat obj;
    private CatBuilder(){

    }
    public static CatBuilder getInstance(){
        if (instance == null){
            instance = new CatBuilder();
        }
        instance.obj = new Cat();
        return instance;
    }
    public CatBuilder setName(String name){
        obj.setName(name);
        return this;
    }

    public CatBuilder setBreed(String breed){
        obj.setBreed(breed);
        return this;
    }
    public CatBuilder setAge(int age){
        obj.setAge(age);
        return this;
    }
    public CatBuilder setWeight(int weight){
        obj.setWeight(weight);
        return this;
    }
    public CatBuilder setColor(String color){
        obj.setColor(color);
        return this;
    }
    public CatBuilder setGoodMood(boolean goodMood){
        obj.setGoodMood(goodMood);
        return this;

    }
    public Cat build(){
        return obj;
    }

    @Override
    public String toString() {
        return "CatBuilder{" +
                "obj=" + obj +
                '}';
    }
}
