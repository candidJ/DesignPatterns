package patterns.strategy;

class ShareViaEmail implements ShareStrategy {

	@Override
	public void share() {
		System.out.println("sharing via email...");
	}

}

class ShareViaText implements ShareStrategy {
	@Override
	public void share() {
		System.out.println("sharing via text...");

	}
}

class ShareViaWhatsApp implements ShareStrategy {
	@Override
	public void share() {
		System.out.println("sharing via whatsapp...");

	}
}