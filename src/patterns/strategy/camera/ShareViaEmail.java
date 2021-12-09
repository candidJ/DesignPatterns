package patterns.strategy.camera;

class ShareViaEmail implements ShareStrategy {

    public void share() {
        System.out.println("sharing via email...");
    }

}
