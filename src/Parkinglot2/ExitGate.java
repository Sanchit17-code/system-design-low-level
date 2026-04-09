package Parkinglot2;

public class ExitGate {


    public long calculatePricing(PricingStrategy pricingStrategy, Ticket ticket){
        return pricingStrategy.calculatePricing(ticket);
    }

    public void recordPayment(PricingStrategy pricingStrategy,Ticket ticket, PaymentStrategy paymentStrategy){
        long price = calculatePricing(pricingStrategy,ticket);
        paymentStrategy.pay(price);
        ticket.getParkingSpot().setOccupied(false);
    }
}
