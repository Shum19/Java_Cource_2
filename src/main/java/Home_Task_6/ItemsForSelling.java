package Home_Task_6;

public class ItemsForSelling {
    private double price;

    public void setPrice(double price ){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return String.format("Price: %s ", this.price);
    }
}
