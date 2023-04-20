package Practice_4;

public class Product {
    //
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getType(){
        Class<?> aClass = getClass();
        String data = aClass.toString();
        return data;

    }
}

