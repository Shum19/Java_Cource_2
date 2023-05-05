package Home_Task_6;

public class BottleOfWaterBuilder {
    private static BottleOfWaterBuilder instance = null;
    private BottleOfWater obj;
    private BottleOfWaterBuilder(){}
    public static BottleOfWaterBuilder getInstance(){
        if(instance == null){
            instance = new BottleOfWaterBuilder();
        }
        instance.obj = new BottleOfWater();
        return instance;
    }
    public BottleOfWaterBuilder setPrice(double price){
        obj.setPrice(price);
        return this;
    }
    public BottleOfWaterBuilder setCondition(String condition){
        obj.setCondition(condition);
        return this;
    }
    public BottleOfWaterBuilder setType(String type){
        obj.setType(type);
        return this;
    }
    public BottleOfWater build(){
        return obj;
    }

    @Override
    public String toString() {
        return "BottleOfWaterBuilder{" +
                "obj=" + obj +
                '}';
    }
}
