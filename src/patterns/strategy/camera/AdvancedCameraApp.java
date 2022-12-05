package patterns.strategy.camera;

public class AdvancedCameraApp extends ShareContext {

	public AdvancedCameraApp() {
		shareStrategy = new ShareViaWhatsApp();
	}

}
