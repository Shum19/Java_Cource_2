package Home_Task_1;
/**
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature)
 * выдающий продукт соответствующий имени, объему и температуре
 */

import java.util.ArrayList;
import java.util.List;

public class MachineHotBeverage implements Machine{
    List<HotBeverage> hb = new ArrayList<>();

    public HotBeverage getHotBeverage(String name, int volume, int temperature){
        for (HotBeverage hotBeverage : this.hb) {
            if (temperature == hotBeverage.getTemperature() & volume == hotBeverage.getVolume() &
                    name.equals(hotBeverage.getName())) return hotBeverage;
        }
        return null;
    }
    @Override
    public HotBeverage getBeverageByType(String type) {
        for (HotBeverage beverage : this.hb) {
            if(type.equals(beverage.getType())) return beverage;
        }
        return null;
    }

    @Override
    public HotBeverage getBeverageByName(String name) {
        for (HotBeverage beverage : this.hb) {
            if(name.equals(beverage.getName())) return beverage;
        }
        return null;
    }

    @Override
    public HotBeverage getBeverageByPrice(double price) {
        for (HotBeverage beverage : this.hb) {
            if(price == beverage.getPrice()) return beverage;
        }
        return null;
    }

    @Override
    public HotBeverage getBeverageByVolume(int volume) {
        for (HotBeverage beverage : this.hb) {
            if(volume == beverage.getVolume()) return beverage;
        }
        return null;
    }


    public void addBeverage(HotBeverage beverage) {
        hb.add(beverage);
    }

    public void printHB(){
        for (HotBeverage hotBeverage : this.hb) {
            System.out.println(hotBeverage);
            System.out.println("-".repeat(25));
        }
    }

}
