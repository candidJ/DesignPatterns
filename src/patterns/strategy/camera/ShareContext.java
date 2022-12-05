package patterns.strategy.camera;

public class ShareContext {

	// Context composes of the Strategy
	ShareStrategy shareStrategy;

	// client will set the desired behavior at run time by calling this method
	public void setShareStrategy(ShareStrategy share) {
		this.shareStrategy = share;
	}

	public ShareStrategy getShareStrategy() {
		return shareStrategy;
	}

	public void share() {
		shareStrategy.share();
	}


}
