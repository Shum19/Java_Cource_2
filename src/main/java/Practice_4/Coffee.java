package Practice_4;

public class Coffee extends Product{
    private String type;
    private int volume;
    public Coffee (String type, int volume){
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, Volume: %d", this.type.toUpperCase(), this.volume);
    }

    public String getType() {
        return this.type;
    }
}
