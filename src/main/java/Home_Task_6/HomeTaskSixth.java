package Home_Task_6;

public class HomeTaskSixth {
    public static void main(String[] args) {
        VendingMachine waterMachine = new VendingMachine();

        waterMachine.addItemForSelling(BottleOfWaterBuilder.getInstance().setPrice(100.00).setCondition("Cold").setType("Sparkling").build());
        waterMachine.addItemForSelling(BottleOfWaterBuilder.getInstance().setPrice(120.50).setCondition("Warm").setType("Still").build());
        waterMachine.addItemForSelling(BottleOfWaterBuilder.getInstance().setPrice(122.50).setCondition("Cold").setType("Still").build());
        System.out.println(waterMachine);

        VendingMachine chips = new VendingMachine();
        chips.addItemForSelling(ChipsBuilder.getInstance().setPrice(150.0f).setTaste("Onion").setWeight(90).build());
        chips.addItemForSelling(ChipsBuilder.getInstance().setPrice(150.0f).setTaste("Garlic").setWeight(90).build());
        chips.addItemForSelling(ChipsBuilder.getInstance().setPrice(150.0f).setTaste("Beacon").setWeight(90).build());
        System.out.println(chips);

        VendingMachine coffee = new VendingMachine();
        coffee.addItemForSelling(CoffeeBuilder.getInstance().setPrice(189.00).setType("Latte").setVolume(300).build());
        coffee.addItemForSelling(CoffeeBuilder.getInstance().setPrice(155.00).setType("Cappuchino").setVolume(300).build());
        coffee.addItemForSelling(CoffeeBuilder.getInstance().setPrice(120.00).setType("Americano").setVolume(150).build());
        System.out.println(coffee.getQuantities());
        System.out.println(coffee);

        VendingMachine commonMachine = new VendingMachine();
        commonMachine.addItemForSelling(waterMachine);
        commonMachine.addItemForSelling(coffee);
        commonMachine.addItemForSelling(chips);
        System.out.println(commonMachine);

//        coffee.makePayment();


    }

}
