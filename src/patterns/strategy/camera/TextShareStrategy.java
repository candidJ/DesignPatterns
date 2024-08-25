package patterns.strategy.camera;

public class TextShareStrategy implements ShareStrategy {

    public void share() {
        System.out.println("Sharing via Text message...");
    }
}
