package Practice_4;

public class TaskForth {
    public static void main(String[] args) {
        VendingMachine<Chips> chipsVendingMachine = new VendingMachine<>();
        VendingMachine<Coffee> coffeeVendingMachine = new VendingMachine<>();

        chipsVendingMachine.addProducts(new Chips(90, "Onion"));
        chipsVendingMachine.addProducts(new Chips(30, "Garlic"));

        coffeeVendingMachine.addProducts(new Coffee("Latte", 300));
        coffeeVendingMachine.addProducts(new Coffee("Americano", 300));

        System.out.println(chipsVendingMachine);
        System.out.println(chipsVendingMachine.getProduct(1));

        coffeeVendingMachine.removeProduct(1);
        System.out.println(coffeeVendingMachine);
        Chips chipsThird = new Chips(30, "Beacon");
        System.out.println(chipsThird.getType());


    }
}
