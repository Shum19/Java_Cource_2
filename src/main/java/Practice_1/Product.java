package Practice_1;

/**Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы getProductsByname и getProductsByPrice
 */
public class Product {
    private String nameProduct;
    private double price;
    public Product(){
        this.nameProduct = "";
        this.price = 0.0d;
    }
    @Override
    public String toString(){
        String data = String.format("%s, Price: %s", nameProduct, price);
        return data;
    }
    public String getNameProduct(){
        return this.nameProduct;
    }
    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
