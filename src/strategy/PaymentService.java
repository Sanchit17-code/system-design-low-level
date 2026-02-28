import PaymentMethod.PaymentMethod;

public class PaymentService {
//    private PaymentMethod paymentMethod;
//
//    public void PaymentService(PaymentMethod paymentMethod){
//        this.paymentMethod = paymentMethod;
//    }

    public void pay(int amount ,PaymentMethod paymentMethod){
        paymentMethod.pay(amount);
    }
}
