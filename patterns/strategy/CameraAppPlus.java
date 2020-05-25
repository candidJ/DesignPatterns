package patterns.strategy;

public class CameraAppPlus extends PhotoWithPhone {
	@Override
	void edit() {
		System.out.println("beautifying image...");
	}
	
//	public CameraAppPlus() {
//		shareStrategy = new ShareViaText();
//	}

}
