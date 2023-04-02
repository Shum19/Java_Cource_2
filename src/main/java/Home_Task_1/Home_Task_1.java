package Home_Task_1;

/** В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести
 *  логику заложенную в программе
 *  Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Home_Task_1 {
    public static void main(String[] args) {

        HotBeverage coffeeEspresso = new HotBeverage();
        coffeeEspresso.setType("Coffee");
        coffeeEspresso.setName("Espresso");
        coffeeEspresso.setPrice(100.52d);
        coffeeEspresso.setVolume(300);
        coffeeEspresso.setTemperature(90);

        HotBeverage coffeeLatte = new HotBeverage();
        coffeeLatte.setType("Coffee");
        coffeeLatte.setName("Latte");
        coffeeLatte.setPrice(150.95d);
        coffeeLatte.setVolume(380);
        coffeeLatte.setTemperature(85);

        HotBeverage blackTea = new HotBeverage();
        blackTea.setType("Black Tea");
        blackTea.setName("Lipton");
        blackTea.setPrice(65.25d);
        blackTea.setVolume(180);
        blackTea.setTemperature(90);

        MachineHotBeverage mhb = new MachineHotBeverage();
        mhb.addBeverage(coffeeEspresso);
        mhb.addBeverage(coffeeLatte);
        mhb.addBeverage(blackTea);

        System.out.println(mhb.getBeverage(380));

    }
}
