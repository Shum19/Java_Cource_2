package Practice_1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfMachine implements Machine{
    List<BottleOfWatter> waters = new ArrayList<>();

    @Override
    public BottleOfWatter getItemByType(String type) {
        for (BottleOfWatter watter : waters) {
            if (type.equals(watter.getType())) return watter;
        }
        return null;
    }

    public BottleOfWatter getItemByCondition(String condition) {
        for (BottleOfWatter watter : waters) {
            if(condition.equals(watter.getCondition())) return watter;
        }
        return null;
    }

    @Override
    public Commodity geItemByPrice(double price) {
        for (BottleOfWatter watter : waters) {
            if (price == watter.getPrice()) return watter;
        }
        return null;
    }

    @Override
    public void addItem(BottleOfWatter bottle) {
        waters.add(bottle);
    }

    @Override
    public String toString () {
        return waters.toString();
    }

}
