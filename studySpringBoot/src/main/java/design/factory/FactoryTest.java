package design.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }



}
