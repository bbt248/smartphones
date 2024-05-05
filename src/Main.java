public class Main {
    public static void main(String[] args) {

        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new iPhones();

        System.out.println("=== Android Phone ===");
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        ((Androids) androidPhone).linuxOS();

        System.out.println("=== iPhone ===");
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        ((iPhones) iPhone).iOS();
    }
}