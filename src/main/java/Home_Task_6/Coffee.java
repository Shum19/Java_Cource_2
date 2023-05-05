package Home_Task_6;



public class Coffee extends Price {
    private String type;
    private int volume;

    public Object setType(String type) {
        this.type = type;
        return null;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getType() {
        return this.type;
    }
    public double getPrice(){
        return super.getPrice();
    }
    @Override
    public String toString() {
        return String.format("%s, Volume: %d(price: )", this.type.toUpperCase(), this.volume, super.getPrice());
    }


}
