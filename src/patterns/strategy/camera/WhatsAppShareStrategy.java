package patterns.strategy.camera;

public class WhatsAppShareStrategy implements ShareStrategy {

    public void share() {
        System.out.println("Sharing via Whatsapp...");
    }

}
