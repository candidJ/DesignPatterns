package patterns.decorator.tennis;

public class TennisApplication {
    public static void main(String args[]) {
        TennisCourtBookingBase hardCourtBooking = new TennisHardCourtBooking();

        hardCourtBooking = new TennisBallsBooking(hardCourtBooking);
        hardCourtBooking = new Coaching(hardCourtBooking);

        System.out.println("description: " + hardCourtBooking.getDescription());
        System.out.println("cost: " + hardCourtBooking.cost() + " dollars");
    }
}
