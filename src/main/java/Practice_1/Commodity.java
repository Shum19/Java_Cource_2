package Practice_1;

/** Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
 *  сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
 *  (пример: ПродающийБутылкиВодыАвтомат)
 */
public abstract class Commodity {
    protected String type;
    protected double price;

    abstract String getType();

    abstract double getPrice();


    abstract void setType(String type);

    abstract void setPrice(double price);
}
