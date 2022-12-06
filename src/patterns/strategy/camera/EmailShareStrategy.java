package patterns.strategy.camera;

public class EmailShareStrategy implements ShareStrategy {

    public void share() {
        System.out.println("Sharing via e-mail...");
    }

}
