package patterns.strategy.camera;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		PhotoBehavior basicCameraApp = new BasicCameraApp();
		PhotoBehavior cameraAppPlus  = new CameraAppPlus();
		basicCameraApp.performShare();
		System.out.println("Before set behavior of Basic Camera App");
		cameraAppPlus.performShare();
		System.out.println("Before set behavior of Camera App Plus");

		String userChoice = userSharingStrategy();
		ShareStrategy share;

		switch (userChoice) {
		case ("E"):
			share = new ShareViaEmail();
			break;
		case ("T"):
			share = new ShareViaText();
			break;
		case ("W"):
			share = new ShareViaWhatsApp();
			break;
		default:
			share = new ShareViaText();
			break;
		}

		// basic app
		// behavior set dynamically by user at run time
		basicCameraApp.setSharingStragey(share);
		// new behavior is performed
		basicCameraApp.performShare();

		// plus app
		// behavior set dynamically by user at run time
		cameraAppPlus.setSharingStragey(share);
		// new behavior is performed
		cameraAppPlus.performShare();
	}

	public static String userSharingStrategy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the type: (E) email, (W) Whatsapp, (T) text ");
		String userChoice = scanner.next();
		scanner.close();
		return userChoice;
	}

}
