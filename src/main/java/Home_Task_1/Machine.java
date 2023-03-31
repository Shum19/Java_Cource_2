package Home_Task_1;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public interface Machine {
//    List<Beverage> beverages = new ArrayList<>();
    Beverage getBeverageByType(String type);
    Beverage getBeverageByName(String name);
    Beverage getBeverageByPrice(double price);
    Beverage getBeverageByVolume(int volume);

}
