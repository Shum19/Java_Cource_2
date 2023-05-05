package Home_Task_6;



public class Chips extends Price {
    private String taste;
    private int weight;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return String.format("Chips with %s weight %s(price: %s ", this.taste, this.weight, super.getPrice());
    }
}
