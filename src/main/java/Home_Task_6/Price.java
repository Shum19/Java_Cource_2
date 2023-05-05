package Home_Task_6;

public class Price {
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Price %d ", this.price);
    }
}
