package Home_Task_6;

public class BottleOfWater extends Price{
    private String condition;
    private String type;


    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s %s water(price : %s)", this.type.toUpperCase(), this.condition.toUpperCase(), super.getPrice());
    }
}
