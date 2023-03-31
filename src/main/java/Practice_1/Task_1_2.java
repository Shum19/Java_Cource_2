package Practice_1;
/** Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
 *  сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
 *  (пример: ПродающийБутылкиВодыАвтомат)
 */
public class Task_1_2 {
    public static void main(String[] args) {
        BottleOfMachine bm = new BottleOfMachine();
        BottleOfWatter bottle_1 = new BottleOfWatter();
        BottleOfWatter bottle_2 = new BottleOfWatter();
        bottle_1.setCondition("Warm");
        bottle_2.setCondition("Cold");
        bottle_1.setType("Lemonade");
        bottle_2.setType("Water");
        bottle_1.setPrice(66.0);
        bottle_2.setPrice(69.0);
        bm.addItem(bottle_1);
        bm.addItem(bottle_2);
        System.out.println(bm);
        System.out.println(bm.geItemByPrice(66));
        System.out.println(bm.getItemByCondition("Cold"));
        System.out.println(bm.getItemByType("Water"));
    }

}
