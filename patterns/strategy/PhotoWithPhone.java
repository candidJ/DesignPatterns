package patterns.strategy;

public abstract class PhotoWithPhone {

	ShareStrategy shareStrategy;

	abstract void edit();

	void take() {
		System.out.println("take photo");
	}

	public void save() {
		System.out.println("saving photo");
	}

	public void performShare() {
		shareStrategy.share();
	}

	public void setSharingStragey(ShareStrategy share) {
		this.shareStrategy = share;
	}

}
