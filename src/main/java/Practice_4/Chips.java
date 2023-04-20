package Practice_4;

public class Chips extends Product{
    private int weight;
    private String taste;

    public Chips(int weight, String taste){
        this.weight = weight;
        this.taste = taste;
    }
    @Override
    public String toString() {
        return String.format("%s, Weight: %d", this.taste.toUpperCase(), this.weight);
    }
}
