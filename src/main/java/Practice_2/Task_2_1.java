package Practice_2;

/**
 * 1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
 * 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать
 *    заказ и факт получения заказа.
 *    Дополнение: для большего понимания у студентов, можно сделать методы-геттеры
 *    для имени и прочих “персональных данных” abstract
 * 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
 */
public class Task_2_1 {
    public static void main(String[] args) {
        Human byer_1 = new Human();
        byer_1.setName("Tom");
        System.out.println(byer_1.getName());
        byer_1.setMakeOrder();
        byer_1.setTakeOrder();
        System.out.println(byer_1.isTakeOrder());
    }
}
