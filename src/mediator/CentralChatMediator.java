package mediator;

import java.util.ArrayList;
import java.util.List;

public class CentralChatMediator {
    List<Person> listOfPersons = new ArrayList<>();

    public void registerPersonInTheGroup(Person person){
        listOfPersons.add(person);
    }

    public void sendMessage(Person person, String message){
        for(Person p : listOfPersons){
            if(p != person){
                p.recieveMessage(person, message);
            }
        }
    }
}
