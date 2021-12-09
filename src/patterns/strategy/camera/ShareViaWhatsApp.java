package patterns.strategy.camera;

class ShareViaWhatsApp implements ShareStrategy {

    public void share() {
        System.out.println("sharing via whatsapp...");
    }

}