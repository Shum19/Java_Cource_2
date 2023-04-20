package Home_Task_4;
/** Класс переименован в VendingMachine из MachineHotBeverage
 *
 */

import java.util.ArrayList;
import java.util.List;

public class VendingMachine <T> {
    private List<T> products = new ArrayList<>();

    public void addProducts(T products) {
        this.products.add(products);
    }


    public String  getBeverage(int indexProduct){
        for (int i = 0; i < this.products.size(); i++) {
            if (indexProduct == i)return this.products.get(i).toString();
        }
        return "No Such Product";
    }

    public List<T> remove(T product){
        for (T item: this.products) {
            if (item.equals(product)) {
                this.products.remove(item);
            }
        }return this.products;
    }


    public List<T> getProducts (){
        return this.products;
    }


}
