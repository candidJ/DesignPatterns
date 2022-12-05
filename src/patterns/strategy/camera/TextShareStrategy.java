package patterns.strategy.camera;

class ShareViaText implements ShareStrategy {

    public void share() {
        System.out.println("Sharing via Text message...");

    }
}
