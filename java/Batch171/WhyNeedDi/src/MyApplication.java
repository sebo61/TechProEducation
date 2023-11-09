//1-Message classı oluşturalım

import domain.Message;
import service.MailService;
import service.MessageService;
import service.SMSService;

public class MyApplication {
    public static void main(String[] args) {

        Message message=new Message();
        message.setMessage("Siparişiniz kargoya verildi.");

//        //2-service
//        //mesajı maille gönderelim.
//        MailService mailService=new MailService();
//        mailService.sendMessage(message);
//
//        //vazgeçtik, hala SMS kullanan var.
//        SMSService smsService=new SMSService();
//        smsService.sendMessage(message);
//
//        //bu böyle gitmez...interface ?-->uyg bakımı ve geliştirme kolaylaşmış
//        MessageService service=new MailService();
//        service.sendMessage(message);

        //run timeda servis objesini belirleyebilir miyiz
        MessageService service1=null;
        String serviceName="MaiService";

        if (args.length>0){
            serviceName=args[0];
        }
        if (serviceName.equalsIgnoreCase("MailService")){

            service1=new MailService();

        }else if(serviceName.equalsIgnoreCase("SMSService")){
            service1=new SMSService();
        }
        service1.sendMessage(message);








    }
}