package Home_Task_4;

/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 */
public class HotBeverage extends Beverage {
    private int temperature;
    public HotBeverage(){
        super.name = "";
        super.type = "";
        super.price = 0.0d;
        super.volume = 0;
        this.temperature = 0;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString(){
        String data = String.format("%s: %s\nPrice: %1.2f rub\nVolume %d ml\nTemperature: %d Celsius",
                                    this.type.toUpperCase(), this.name.toUpperCase(), this.price,
                                    this.volume, this.temperature);
        return "\n" + data;
    }
    public String getType() {
        return super.type;
    }

    public void setType(String type) {
        super.type = type;
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public double getPrice() {
        return super.price;
    }

    public void setPrice(double price) {
        super.price = price;
    }

    public int getVolume() {
        return super.volume;
    }

    public void setVolume(int volume) {
        super.volume = volume;
    }

}
