package observer.observer.impl;

import observer.observer.NotificationChannel;

public class EmailNotification implements NotificationChannel {
    private String user;

    public EmailNotification(String user){
        this.user = user;
    }
    @Override
    public void update(String stockName, int price) {
        System.out.println(user +  " recieved email:" + " " + stockName + " price updated to " + price);
    }
}
