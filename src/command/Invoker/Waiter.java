package command.Invoker;

import command.Commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();
    public void placeOrder(Command order){
        orders.add(order);
    }
    public void execute(){
        for(Command order : orders){
            order.execute();
        }
    }
}
