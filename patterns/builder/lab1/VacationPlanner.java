package patterns.builder.lab1;

import java.util.*;

public class VacationPlanner {
    private Map<String, Date> hotelBooking = new HashMap<String, Date>();
    private String specialEventTickets;
    private String movieTickets;
    private String dining;

    public static class Builder {
        // required parameters
        private Map<String, Date> hotelBooking;

        // optional parameters initialized to default values
        private String specialEventsTickets = "";
        private String movieTickets = "";
        private String dining = "";

        public Builder(Map<String, Date> val) {
            hotelBooking = val;
        }

        public Builder addSpecialEventTickets(String val) {
            specialEventsTickets = val;
            return this;
        }

        public Builder addMovieTickets(String val) {
            movieTickets = val;
            return this;
        }

        public Builder addDiningReservations(String val) {
            this.dining = val;
            return this;
        }

        public VacationPlanner build() {
            return new VacationPlanner(this);
        }
    }

    private VacationPlanner(Builder builder) {
        hotelBooking = builder.hotelBooking;
        this.dining = builder.dining;
        this.movieTickets = builder.movieTickets;
        this.specialEventTickets = builder.specialEventsTickets;
        System.out.println("Vacation Planner for city " + hotelBooking + " with dining at " + dining + " with special event at " + specialEventTickets);
    }

}
