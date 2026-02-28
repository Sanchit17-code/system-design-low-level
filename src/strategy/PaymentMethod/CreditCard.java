package PaymentMethod;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paying through credit card");
    }

}
