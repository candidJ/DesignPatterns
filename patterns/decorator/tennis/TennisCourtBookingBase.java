package patterns.decorator.tennis;

public abstract class TennisCourtBookingBase {
        String description;
        public String getDescription(){
                return this.description;
        }
        abstract double cost();
}
