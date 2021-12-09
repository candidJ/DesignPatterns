package patterns.strategy.camera;

public class BasicCameraApp extends PhotoBehavior {

	void edit() {
		System.out.println("no filter applied...");
	}

	public BasicCameraApp() {
		this.shareStrategy = new ShareViaEmail();
	}
}