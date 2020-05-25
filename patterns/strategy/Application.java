package patterns.strategy;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		PhotoWithPhone basic = new BasicCameraApps();
//		basic.performShare();
//
//		PhotoWithPhone plus = new CameraAppPlus();
//		plus.performShare();
//
//		PhotoWithPhone premium = new CameraAppPremium();
//		premium.performShare();

		PhotoWithPhone basicApp = new BasicCameraApp();
		PhotoWithPhone plusApp = new CameraAppPlus();
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
		basicApp.setSharingStragey(share);
		basicApp.edit();
		basicApp.performShare();

		// plus app
		plusApp.setSharingStragey(share);
		plusApp.edit();
		plusApp.performShare();
	}

	public static String userSharingStrategy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the type: (E) email, (W) Whatsapp, (T) text ");
		String userChoice = scanner.next();
		scanner.close();
		return userChoice;
	}

}
