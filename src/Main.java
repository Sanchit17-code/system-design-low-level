import TicTacToe.GameEngine;
import TicTacToe.Player;
import command.Chef.Chef;
import command.Commands.BurgerOrderCommand;
import command.Commands.Command;
import command.Commands.PizzaOrderCommand;
import command.Invoker.Waiter;
import mediator.CentralChatMediator;
import mediator.Person;
import observer.observable.Stock;
import observer.observer.NotificationChannel;
import observer.observer.impl.EmailNotification;
import observer.observer.impl.SlackNotification;
import strategy.PaymentMethod.CreditCard;
import strategy.PaymentMethod.Crypto;
import strategy.PaymentMethod.UPI;
import strategy.PaymentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

//        ---------------------------------strategy---------------------------------
//        PaymentService paymentService = new PaymentService();
//        paymentService.pay(1000,new CreditCard());
//        paymentService.pay(500,new UPI());
//        paymentService.pay(200,new Crypto());
//        --------------------------------------strategy end-------------------------------

        // ----------------------------------observer start----------------------------------------------------
//       Stock tcs =  new Stock("tcs",1000);
//       Stock ril =  new Stock("ril",9000);
//       Stock tata =  new Stock("tata",1000);
//
//        NotificationChannel rahulslack = new SlackNotification("rahul");
//        NotificationChannel snehaemail = new EmailNotification("sneha");
//
//        tcs.add(rahulslack);
//        ril.add(rahulslack);
//        tata.add(rahulslack);
//
//        ril.add(snehaemail);
//        tata.add(snehaemail);
//
//        tcs.notifyAllChannels();
//        ril.notifyAllChannels();
//        tata.notifyAllChannels();

        // ----------------------------------observer end----------------------------------------------------
        // =-----------------------------------hashmap practise-----------------------------------
//        HashMap<String,Integer> map = new HashMap<>();
//        map.put("Sanchit",1);
//        map.put("Sparsh",2);
//        map.put("sharad",3);
//        map.put("navneet",4);
//        System.out.println(map);
//        System.out.println(map.get("Sanchit"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println("key -> " + entry.getKey() + " and the value is -> " + entry.getValue());
//        }
//
//        for(String key : map.keySet()){
//            System.out.println("key is " + key + " and the value is " + map.get(key));
//        }
        // ---------------------------------------------------------------------------------------------------------//
        // ---------------------------------------------Command design pattern-----------------------------------------------//
//        Waiter waiter = new Waiter();
//        Chef sanchit = new Chef("sanchit");
//        Command preparePizzaCommand = new PizzaOrderCommand(sanchit);
//        Command prepareBurgerCommand = new BurgerOrderCommand(sanchit);
//
//        waiter.placeOrder(prepareBurgerCommand);
//        waiter.placeOrder(prepareBurgerCommand);
//        waiter.placeOrder(preparePizzaCommand);
//        waiter.placeOrder(preparePizzaCommand);
//        waiter.placeOrder(preparePizzaCommand);

//        waiter.execute();   // running whenever needed or based on some business logic
//----------------------------------------------- command design pattern end--------------------------------------------//

        // ------------------------mediator design pattern -----------------------------------------------
//        CentralChatMediator mediator = new CentralChatMediator();
//        Person p1 = new Person("Sanchit", mediator);
//        Person p2 = new Person("Rakesh", mediator);
//        Person p3 = new Person("Salman", mediator);
//        Person p4 = new Person("Shahrukh", mediator);
//        Person p5 = new Person("Sparsh", mediator);
//
//        mediator.registerPersonInTheGroup(p1);
//        mediator.registerPersonInTheGroup(p2);
//        mediator.registerPersonInTheGroup(p3);
//        mediator.registerPersonInTheGroup(p4);
//        mediator.registerPersonInTheGroup(p5);
//
//        p1.sendMessage("message from sanchit to everyone");
//        p2.sendMessage("message from Rakesh to everyone");
//        p3.sendMessage("message from Salman to everyone");
//        p4.sendMessage("message from Shahrukh to everyone");

        // ==========================================mediator design pattern end-----------------------------------------//
        List<Player> players = new ArrayList<>();
        Player p1 = new Player("Sanchit",'#');
        Player p2 = new Player("Sharad",'O');

        players.add(p1);
        players.add(p2);
        int size = 3;

        GameEngine engine = new GameEngine(players,3);
        engine.play();


    }
}