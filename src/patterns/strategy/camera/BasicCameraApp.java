package patterns.strategy.camera;

public class BasicCameraApp extends ShareContext {

	public BasicCameraApp() {
		this.shareStrategy = new EmailShareStrategy();
	}

}