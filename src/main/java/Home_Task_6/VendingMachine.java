package Home_Task_6;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T> implements VendingMachinePayment, VendingMachineService<T>{
    private List <T> itemsForSelling = new ArrayList<>();

    public List<T> getItemsForSelling() {
        return this.itemsForSelling;
    }
    public int getQuantities(List<T> itemsForSelling){
        return itemsForSelling.size()-1;
    }

    @Override
    public void creditCardPayment() {
        System.out.println("Insert Card");


    }

    @Override
    public void cashPayment() {

    }

    @Override
    public void pTopPayment() {

    }

    @Override
    public void addItemForSelling(T itemForSelling) {
        this.itemsForSelling.add(itemForSelling);

    }

    @Override
    public void makePayment() {

    }

    @Override
    public void removeItemForSelling(T itemForSelling) {
        this.itemsForSelling.remove(itemForSelling);

    }
}
