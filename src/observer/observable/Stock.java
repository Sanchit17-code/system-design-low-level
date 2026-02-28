package observer.observable;

import observer.observer.NotificationChannel;

import java.util.ArrayList;
import java.util.List;

public class Stock {
   private String stockName;
   private int price;


    public Stock(String stockName, int price){
       this.stockName = stockName;
       this.price = price;
   }

   List<NotificationChannel> channelList = new ArrayList<>();
   public void add(NotificationChannel channel){
       channelList.add(channel);
   }
   public void remove(NotificationChannel channel){
       channelList.remove(channel);
   }
   public void setStockName(String stockName) {
       this.stockName = stockName;
   }
   public void setPrice(int price) {
       this.price = price;
       notifyAllChannels();
   }

    public int getPrice() {
        return price;
    }

    public String getStockName() {
        return stockName;
    }

    public void notifyAllChannels(){
       for(NotificationChannel ch : channelList){
           ch.update(this.stockName,this.price);
       }
    }
}
