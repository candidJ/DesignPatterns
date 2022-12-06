package patterns.strategy.camera;

// concrete sub class implements a specific kind of behavior when initialized
public class BasicCameraApp extends ShareContext {

	public BasicCameraApp() {
		this.shareStrategy = new EmailShareStrategy();
	}
}