package patterns.strategy.camera;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		String userChoice = captureUserChoice();
		ShareStrategy shareStrategy;

		// depending upon the user choice, the behavior is initialized
		switch (userChoice) {
		case ("E"):
			shareStrategy = new EmailShareStrategy();
			break;
		case ("T"):
			shareStrategy = new TextShareStrategy();
			break;
		case ("W"):
			shareStrategy = new ShareViaWhatsApp();
			break;
		default:
			shareStrategy = new TextShareStrategy();
			break;
		}

		// app is concrete implementation of Behavior Context
		// basic app
		ShareContext basicCameraApp = new BasicCameraApp();
		basicCameraApp.share();
		System.out.println("Basic camera app behavior by default is Share Via Email");
		basicCameraApp.setShareStrategy(shareStrategy);
		// user selected behavior is performed which may override the default behavior 
		basicCameraApp.share();

		// advanced app
		ShareContext advancedCameraApp  = new AdvancedCameraApp();
		advancedCameraApp.share();
		System.out.println("Advanced camera app behavior by default is Share Via Whatsapp");
		advancedCameraApp.setShareStrategy(shareStrategy);
		advancedCameraApp.share();

		// alternatively, no need to create a concrete implementation of context
		ShareContext context = new ShareContext();
		context.setShareStrategy(shareStrategy);
		context.share();
	}

	public static String captureUserChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the type: (E) e-mail, (W) Whatsapp, (T) Text ");
		String userChoice = scanner.next();
		scanner.close();
		return userChoice;
	}

}
