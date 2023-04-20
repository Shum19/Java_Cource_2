package Practice_4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine <T extends Product>{
    // Добавить в список продуктов; получать и удалять; должен быть один класс
    private List<T> products = new ArrayList<>();
    public void addProducts (T product){
        this.products.add(product);
    }
    public void removeProduct(int indexProduct){
        for (int i = 0; i < this.products.size(); i++){
            if (indexProduct == i){
                this.products.remove(i);
            }
        }
    }
    public T getProduct(int indexProduct){
        for (int i = 0; i < this.products.size(); i++){
            if (i == indexProduct) return this.products.get(i);
        }
        return null;
    }
    public List<T> getProducts(){
        return this.products;
    }

    @Override
    public String toString() {
        String nameProduct = String.format("%s", "Product ");
        return "VendingMachine{" +
                nameProduct + this.products +
                '}';
    }
}
