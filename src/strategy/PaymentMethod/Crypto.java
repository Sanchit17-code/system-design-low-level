package PaymentMethod;

public class Crypto implements PaymentMethod{

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paying through crypto");
    }
}
