package Practice_1;

import java.util.ArrayList;
import java.util.List;
/**Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы getProductByname и getProductsByPrice
 */
public class VendingMachine {
    private List <Product> products = new ArrayList<>();
    public Product getProductByName(String name){
        for (Product product : products) {
            if(name.equals(product.getNameProduct())){
                return product;
            }
        }
        return null;
    }
    public Product getProductByCost (double price){
        for (Product product: products ) {
            if(price == product.getPrice()){
                return product;
            }
        }
        return null;
    }
    public List<Product> addProduct (List<Product> productList){
        return this.products = productList;
    }
}
