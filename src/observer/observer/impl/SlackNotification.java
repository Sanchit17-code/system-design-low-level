package observer.observer.impl;

import observer.observer.NotificationChannel;

public class SlackNotification implements NotificationChannel {

    private String user;

    public SlackNotification(String user){
        this.user = user;
    }

    @Override
    public void update(String stockName, int price){
        System.out.println(user +  " recieved slack message:" + " " + stockName + " price updated to " + price);
    }
}
