package patterns.strategy.camera;

// Context is composed of Strategy. It delegates the task to Strategy.
public class ShareContext {

	ShareStrategy shareStrategy;

	// client will set the desired behavior at run time by calling this method
	public void setShareStrategy(ShareStrategy shareStrategy) {
		this.shareStrategy = shareStrategy;
	}

	public void share() {
		shareStrategy.share();
	}
}
