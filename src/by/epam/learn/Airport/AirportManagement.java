package by.epam.learn.Airport;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class AirportManagement {
    static final int COUNT_GATES = 5;
    static final int COUNT_AIRCRAFTS = 8;

    static final String FLIGHT_CELL = "| Flight ";
    static final String DESTINATION_CELL = "| Destination";
    static final String STATUS_CELL = "| Status             |";
    static final String GATE_CELL = "Gate |";
    static final String TERMINAL_CELL = "Terminal |";

    // Semaphore
    public static Semaphore airport = new Semaphore(COUNT_GATES, true);
    // Control Gates flags
    static boolean[] gate = null;

    ArrayList<AircraftThread> aircrafts;
    public AirportManagement(ArrayList<AircraftThread> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public static void main(String[] args) throws InterruptedException {
        
        // Creating terminals ArrayList
        ArrayList<Terminal> terminals = new ArrayList<>();
        terminals.add( new Terminal(1, "Short-haul"));
        terminals.add( new Terminal(2, "Medium -haul"));
        terminals.add( new Terminal(3, "Long-haul"));
        terminals.add( new Terminal(4, "Ultra long-haul"));

        TerminalList listTerm = new TerminalList(terminals);

        // Creating aircrafts ArrayList
        ArrayList<AircraftThread> aircrafts = new ArrayList<>();
        aircrafts.add( new AircraftThread
                ("LO 015", "NEWARK (EWR)", "Boeing 787-800", 107, 7039,listTerm));
        aircrafts.add( new AircraftThread
                ("LO 433", "WARSAW L.CHOPINA", "Embraer 195", 107, 480,listTerm));
        aircrafts.add( new AircraftThread
                ("VA 1212", "CANBERRA AIRPORT", "Boeing 737-500", 110, 15100, listTerm));
        aircrafts.add( new AircraftThread
                ("LO 433", "DANYLO HALYTSKYI", "Citation Mustang", 4, 512, listTerm));
        aircrafts.add( new AircraftThread
                ("AC 7541", "TORONTO PEARSON", "Hawker 800XP5", 8, 6800, listTerm));
        aircrafts.add( new AircraftThread
                ("BA 847", "HEATHROW AIRPORT", "Embraer 175", 76, 1900, listTerm));
        aircrafts.add( new AircraftThread
                ("BRU 8743", "MOSCOW SHEREMETYEVO", "Boeing 737-800", 189, 675, listTerm));
        aircrafts.add( new AircraftThread
                ("VA 1111", "AUCKLAND AIRPORT", "Boeing 737-700", 200, 16800, listTerm));

//        Setting number of Gates
        gate = new boolean[COUNT_GATES];
//        Control Gates flags [true-FREE,false-OCCUPIED]
        for (int i = 0; i < COUNT_GATES; i++)
            gate[i] = true;
        /*
         *  Setting following semaphore's parameters: - number of permits (aircrafts per 1 terminal) = 5
         *                                             - fair = true (queue first_in-first_out)
         */
        System.out.printf("%-11s%-21s%-25s%-5s%-5s%n", FLIGHT_CELL, DESTINATION_CELL, STATUS_CELL, GATE_CELL, TERMINAL_CELL);
        System.out.printf("%-11s%-21s%-25s%-5s%-5s%n", "| NO     ", "|            ", "|                    |", "     |", "         |");
        System.out.println("|-----------------------------------------------------------------------|");
        for (int i = 0; i < COUNT_AIRCRAFTS; i++) {
            new Thread(aircrafts.get(i)).start();
        }
    }
}