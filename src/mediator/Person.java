package mediator;

public class Person {
    private String name;
    private CentralChatMediator mediator;

    public Person(String name, CentralChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message){
        mediator.sendMessage(this, message);
    }

    public  void recieveMessage(Person p, String message){
        System.out.println(p.name + " has sent the message to " + this.name + " and the message is " + message);
    }
}
