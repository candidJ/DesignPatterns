package patterns.strategy.camera;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		String userChoice = captureUserChoice();

		// depending upon the user choice at run, the desired strategy is set
		ShareStrategy shareStrategy = switch (userChoice) {
            case ("E") -> new EmailShareStrategy();
            case ("T") -> new TextShareStrategy();
            case ("W") -> new WhatsAppShareStrategy();
            default -> throw new RuntimeException("Invalid type selected. Please choose any of 'E', 'T' or 'W'");
        };

        // app is concrete implementation of Behavior Context
		// basic app
		ShareContext basicCameraApp = new BasicCameraApp();
		System.out.println("Basic camera app behavior by default is...");
		basicCameraApp.share();
		System.out.println("Applying your preferred share method for Basic camera app");
		basicCameraApp.setShareStrategy(shareStrategy);
		// user selected behavior overrides the default BasicCameraApp behavior
		basicCameraApp.share();

		// advanced app
		ShareContext advancedCameraApp  = new AdvancedCameraApp();
		System.out.println("Advanced camera app behavior by default is...");
		advancedCameraApp.share();
		System.out.println("Applying your preferred share method for Advanced camera app");
		advancedCameraApp.setShareStrategy(shareStrategy);
		advancedCameraApp.share();

	}

	public static String captureUserChoice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the type: (E) e-mail, (W) Whatsapp, (T) Text ");
		String userChoice = scanner.next();
		scanner.close();
		return userChoice;
	}

}
