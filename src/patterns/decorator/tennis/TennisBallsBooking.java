package patterns.decorator.tennis;

public class TennisBallsBooking extends TennisCourtBookingDecorator {
    public TennisBallsBooking(TennisCourtBookingBase tennisCourtBookingBase) {
        this.tennisCourtBookingBase = tennisCourtBookingBase;
    }

    @Override
    public String getDescription() {
        return this.tennisCourtBookingBase.description + " + tennis balls";
    }

    @Override
    double cost() {
        return this.tennisCourtBookingBase.cost();
    }
}
