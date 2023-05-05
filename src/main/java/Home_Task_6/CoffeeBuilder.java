package Home_Task_6;

public class CoffeeBuilder {
    private static CoffeeBuilder instance = null;
    private Coffee obj;
    private CoffeeBuilder(){}
    public static CoffeeBuilder getInstance(){
        if (instance == null){
            instance = new CoffeeBuilder();
        }
        instance.obj = new Coffee();;
        return instance;
    }

    public CoffeeBuilder setPrice(double price){
        obj.setPrice(price);
        return this;
    }
    public  CoffeeBuilder setVolume(int volume){
        obj.setVolume(volume);
        return this;
    }
    public CoffeeBuilder setType(String type){
        obj.setType(type);
        return this;
    }
    public Coffee build(){
        return obj;
    }
}
