import observer.observable.Stock;
import observer.observer.NotificationChannel;
import observer.observer.impl.EmailNotification;
import observer.observer.impl.SlackNotification;
import strategy.PaymentMethod.CreditCard;
import strategy.PaymentMethod.Crypto;
import strategy.PaymentMethod.UPI;
import strategy.PaymentService;

public class Main {
    public static void main(String[] args){

//        ---------------------------------strategy---------------------------------
//        PaymentService paymentService = new PaymentService();
//        paymentService.pay(1000,new CreditCard());
//        paymentService.pay(500,new UPI());
//        paymentService.pay(200,new Crypto());
//        --------------------------------------strategy end-------------------------------

       Stock tcs =  new Stock("tcs",1000);
       Stock ril =  new Stock("ril",9000);
       Stock tata =  new Stock("tata",1000);

        NotificationChannel rahulslack = new SlackNotification("rahul");
        NotificationChannel snehaemail = new EmailNotification("sneha");

        tcs.add(rahulslack);
        ril.add(rahulslack);
        tata.add(rahulslack);

        ril.add(snehaemail);
        tata.add(snehaemail);

        tcs.notifyAllChannels();
        ril.notifyAllChannels();
        tata.notifyAllChannels();

    }
}