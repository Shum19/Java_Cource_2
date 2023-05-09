package Practice_4;

public class BottleOfMachine extends Product {
    private String condition;
    private String type;
    public  BottleOfMachine(String condition, String type){
        this.condition = condition;
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("%s, %s", this.type.toUpperCase(), this.condition.toUpperCase());
    }
}
