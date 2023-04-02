package Home_Task_1;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public interface Machine {

    Beverage getBeverage(String type_name);

    Beverage getBeverage(double price);
    Beverage getBeverage(int volume);

}
