package Parkinglot2;

public class Cash implements PaymentStrategy{
    @Override
    public void pay(long price) {
        System.out.println("payment of " + price + " has been recorded via cash");
    }
}
