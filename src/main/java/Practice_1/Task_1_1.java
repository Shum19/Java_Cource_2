package Practice_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1_1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        VendingMachine m = new VendingMachine();
        for (int i = 0; i < 10; i++ ){
            Product product = new Product();
            int num = i + 1;
            product.setNameProduct("Prod_" + num);
            product.setPrice(i + 2 * 1.02);
            products.add(product);
        }
        for (Product product : m.addProduct(products)) {
            if(product.equals(m.getProductByName("Prod_5"))) System.out.println(product);
            if(product.equals(m.getProductByCost(2.04))) System.out.println(product);
        }
    }
}
