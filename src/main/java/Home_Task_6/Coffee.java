package Home_Task_6;



public class Coffee extends ItemsForSelling {
    private String type;
    private int volume;

    public void setType(String type) {
        this.type = type;
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
    @Override
    public String toString() {
        return String.format("%s, Volume: %d", this.type.toUpperCase(), this.volume);
    }


}
