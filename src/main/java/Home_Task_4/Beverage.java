package Home_Task_4;

/**
 * Абстрактный класс Напиток который имеет общие поля тип(кофе, чай, лимонад, вода),
 * имя(Латте, Липтон, Спрайт, Акваминераль), состояние(теплое, холодное), цена, объем.
 */
public abstract class Beverage {
    protected String type, name;
    protected double price;
    protected int volume;

    public abstract String getType();

    public abstract void setType(String type);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public abstract int getVolume();

    public abstract void setVolume(int volume);
}
