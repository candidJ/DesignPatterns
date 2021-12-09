package patterns.strategy.camera;

public class CameraAppPlus extends PhotoBehavior {
	void edit() {
		System.out.println("beautifying image...");
	}
	
	public CameraAppPlus() {
		shareStrategy = new ShareViaText();
	}

}
