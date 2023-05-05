package Home_Task_6;

import Practice_6.CatBuilder;

public class ChipsBuilder {
    private static ChipsBuilder instance = null;
    private Chips obj;
    private  ChipsBuilder(){}
    public static ChipsBuilder getInstance(){
        if (instance == null){
            instance = new ChipsBuilder();
        }
        instance.obj = new Chips();
        return instance;
    }
    public ChipsBuilder setTaste(String taste){
        obj.setTaste(taste);
        return this;
    }
    public ChipsBuilder setWeight(int weight){
        obj.setWeight(weight);
        return this;
    }
    public ChipsBuilder setPrice(double price){
        obj.setPrice(price);
        return this;
    }
    public Chips build(){return obj;}

    @Override
    public String toString() {
        return "ChipsBuilder{" +
                "obj=" + obj +
                '}';
    }
}
