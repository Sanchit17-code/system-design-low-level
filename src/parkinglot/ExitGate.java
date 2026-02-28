package parkinglot;

import parkinglot.pricingstrategy.BasePricingStrategy;

public class ExitGate {
    private final BasePricingStrategy strategy;

    public ExitGate(BasePricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processExit(Ticket ticket){
        ticket.getSlot().setIsFree(true);
        double cost = strategy.costComputation(ticket);

    }
}
