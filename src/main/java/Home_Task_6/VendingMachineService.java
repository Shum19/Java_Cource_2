package Home_Task_6;

import java.util.List;

public interface VendingMachineService <T>  {
    void addItemForSelling(T itemForSelling);
    void removeItemForSelling(T itemForSelling);
    void makePayment();

}
