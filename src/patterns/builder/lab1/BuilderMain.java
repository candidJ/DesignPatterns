package patterns.builder.lab1;

import java.util.Date;
import java.util.HashMap;

public class BuilderMain {
    public static void main(String args[]) {
        HashMap<String, Date> seattle = new HashMap<String, Date>();
        seattle.put("Seattle", new Date());
        VacationPlanner Seattle = new VacationPlanner.Builder(seattle)
                .addDiningReservations("Yellow Scissors")
                .addSpecialEventTickets("Doplhin Showtine")
                .build();
    }
}