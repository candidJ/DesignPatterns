package patterns.decorator.tennis;

public class TennisHardCourtBooking extends TennisCourtBookingBase {

    public TennisHardCourtBooking() {
        this.description = "Hard court booking";
    }

    double cost() {
        return 99;
    }
}
