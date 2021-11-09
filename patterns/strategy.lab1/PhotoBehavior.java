package patterns.strategy.lab1;

public class PhotoBehavior {

	ShareStrategy shareStrategy;

	void take() {
		System.out.println("taking photo...");
	}

	public void save() {
		System.out.println("saving photo...");
	}

	public void performShare() {
		shareStrategy.share();
	}

	public void setSharingStragey(ShareStrategy share) {
		this.shareStrategy = share;
	}

}
