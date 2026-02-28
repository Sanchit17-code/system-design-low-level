package strategy.PaymentMethod;

public class UPI implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println(amount +  " paying through upi");
    }

}
