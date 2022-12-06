package patterns.decorator.tennis;

public class Coaching extends TennisCourtBookingDecorator {

    public Coaching(TennisCourtBookingBase tennisCourtBookingBase) {
        this.tennisCourtBookingBase = tennisCourtBookingBase;
    }

    @Override
    public String getDescription() {
        return this.tennisCourtBookingBase.getDescription() + " + coaching";
    }

    @Override
    double cost() {
        return this.tennisCourtBookingBase.cost() + 149;
    }
}
