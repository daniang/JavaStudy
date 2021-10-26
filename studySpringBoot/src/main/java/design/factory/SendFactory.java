package design.factory;

public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }


    public static Sender producemail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
