package service;

import domain.Message;

public class SMSService implements MessageService {

    public void sendMessage(Message message){
        System.out.println("Ben bir SMSServisiyim. Mesajınız :"+message.getMessage());
    }


}
