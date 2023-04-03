package Practice_2;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди,
 *    принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление
 *    состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в
 *    очереди в различных статусах
 */
public class Task_2_2 {
    public static void main(String[] args) {
        Human byer_1 = new Human();
        Human byer_2 = new Human();
        byer_1.setName("Tom");
        byer_2.setName("Jerry");

        Market market = new Market();
        market.takeInQueue(byer_1);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();

        market.takeInQueue(byer_2);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();

        market.acceptToMarket(byer_1);
        market.releaseFromMarket(byer_1);
        market.acceptToMarket(byer_2);
        market.releaseFromMarket(byer_2);
        System.out.println(market);

    }
}
