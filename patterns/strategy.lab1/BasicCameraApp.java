package patterns.strategy;

public class BasicCameraApp extends PhotoWithPhone {
	@Override
	void edit() {
		System.out.println("no filter applied...");
	}

//	public BasicCameraApp() {
//		shareStrategy = new ShareViaEmail();
//	}
}

//
//class CameraAppPremium extends Photography {
//	@Override
//	void edit() {
//		System.out.println("adding no filter...");
//	}
//	
//	public CameraAppPremium() {
//		shareBehavior = new ShareViaWhatsApp();
//	}
//}