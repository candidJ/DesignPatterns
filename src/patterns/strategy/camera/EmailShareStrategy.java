package patterns.strategy.camera;

class ShareViaEmail implements ShareStrategy {

    public void share() {
        System.out.println("Sharing via e-mail...");
    }

}
