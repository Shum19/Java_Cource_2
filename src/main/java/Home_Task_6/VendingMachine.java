package Home_Task_6;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine<T> implements VendingMachinePayment, VendingMachineService<T>{
    private List <T> itemsForSelling = new ArrayList<>();

    public List<T> getItemsForSelling() {
        return this.itemsForSelling;
    }
    public int getQuantities(){
        return itemsForSelling.size();
    }

    @Override
    public void creditCardPayment(int indexItem) {
        String item = this.itemsForSelling.get(indexItem).toString();
        System.out.println("Insert Card");
        System.out.println("Processing..........");
        System.out.printf("Take your %s \nThank you!", item);


    }

    @Override
    public void cashPayment(int indexItem) {
        String item = this.itemsForSelling.get(indexItem).toString();
        System.out.println("Insert Money");
        System.out.printf("Take your %s \nThank you!", item);

    }

    @Override
    public void pTopPayment(int indexItem) {
        String item = this.itemsForSelling.get(indexItem).toString();
        System.out.println("Scan QR Code");
        System.out.println("Processing..........");
        System.out.printf("Take your %s \nThank you!", item);

    }

    @Override
    public void addItemForSelling(T itemForSelling) {
        this.itemsForSelling.add(itemForSelling);

    }

    @Override
    public void makePayment() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println( "1.Payment by Card\n" +
                                "2.Payment in Cash\n" +
                                "3.Payment pToP\n" +
                                "4.Cancel");
            String input = scanner.next();
            switch (input){
                case "1":
                    int choiceOfItem = scanner.nextInt();
                    this.itemsForSelling.remove(choiceOfItem);
                    creditCardPayment(choiceOfItem);
                    flag = false;
                case "2":
                    int choiceOfItemSecond = scanner.nextInt();
                    this.itemsForSelling.remove(choiceOfItemSecond);
                    cashPayment(choiceOfItemSecond);
                    flag = false;

                case "3":
                    int choiceOfItemThird = scanner.nextInt();
                    this.itemsForSelling.remove(choiceOfItemThird);
                    pTopPayment(choiceOfItemThird);
                    flag = false;
                case "4":
                    flag = false;
            }

        }



    }

    @Override
    public void removeItemForSelling(T itemForSelling) {
        this.itemsForSelling.remove(itemForSelling);

    }

    @Override
    public String toString() {
        String data = getItemsForSelling().toString();
        return String.format("%s", data);
    }
}
