package VendingMachine;

public class Card implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("processing payment of " + amount + " via card");
    }
}
