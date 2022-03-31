package by.epam.learn.Airport;

import static by.epam.learn.Airport.AirportManagement.*;

public class AircraftThread implements Runnable {
    static final int SPEED_BOARDING = 5;

    static final String ARRIVED_CELL = "| Arrived            |";
    static final String CHECKING_GATE_CELL = "| Checking for Gate  |";
    static final String FOLLOWING_TERMINAL_CELL = "| Following Terminal |";
    static final String LAUNCHING_CELL = "| Launching to Gate  |";
    static final String BOARDING_CELL = "| Boarding           |";
    static final String FINAL_CALL_CELL = "| Final call         |";
    static final String GATE_CLOSED_CELL = "| Gate closed        |";
    static final String DEPARTED_CELL = "| Departed           |";
    static final String WAITING_CELL = "| Waiting for        |";
    static final String FOR_RELEASING_GATE_CELL = "| releasing a Gate   |";
    
    String flightNO;
    String destination;
    String model;
    int capacity;
    int flightRange;
    
    TerminalList terminals;

    public AircraftThread(String flightNO, String destination, String model, int capacity, int flightRange, TerminalList terminals) {
        this.flightNO = flightNO;
        this.destination = destination;
        this.model = model;
        this.capacity = capacity;
        this.flightRange = flightRange;
        this.terminals = terminals;
    }

    public String getFlightNO() {
        return flightNO;
    }

    private String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    @Override
    public String toString() {
        return '\n' + "Flight №:" + flightNO + ", " + "Destination: " + destination
                + ", " + "Model: " + model + ", " + "Capacity, passengers: " + capacity;
    }

    public int followTerminal() {
        if (getFlightRange() <= 1000) {
            return terminals.getTerminals().get(0).getTerminalNumber();
        } else if (getFlightRange() > 1000 && getFlightRange() <= 2500) {
            return terminals.getTerminals().get(1).getTerminalNumber();
        } else if (getFlightRange() > 2500 && getFlightRange() <= 6000) {
            return terminals.getTerminals().get(2).getTerminalNumber();
        } else {
            return terminals.getTerminals().get(3).getTerminalNumber();
        }
    }

    @Override
    public void run() {
        System.out.printf("%n%-11s%-21s%-25s%-5s%-5s%n", "| " + getFlightNO(), "| " + getDestination(), ARRIVED_CELL, "     |", "         |");
        try {
            // requiring for the permit
            airport.acquire();
            System.out.printf("%n%-11s%-21s%-25s%-5s%-5d%-1s%n", "| " + getFlightNO(), "| " + getDestination(), FOLLOWING_TERMINAL_CELL, "     |    ", followTerminal(), "| ");
            System.out.printf("%n%-11s%-21s%-25s%-5s%-5d%-1s%n", "| " + getFlightNO(), "| " + getDestination(), CHECKING_GATE_CELL, "     |    ", followTerminal(), "| ");
            System.out.printf("%n%-11s%-21s%-25s%-5s%-5s%n%-11s%-21s%-25s%-5s%-5s%n", "| " + getFlightNO(), "| " + getDestination(), WAITING_CELL, "     |", "         |",
                    "|        ", "|            ", FOR_RELEASING_GATE_CELL, "     |", "         |");
            int controlNumber = -1;
            // looking for free Gate and driving up to it
            synchronized (gate) {
                for (int i = 0; i <= COUNT_GATES; i++)
                    // If there is a free Gate?
                    if (gate[i]) {
                        // Taking the place
                        gate[i] = false;
                        controlNumber = i;
                        System.out.printf("%n%-11s%-21s%-25s%-5d%-1s%-5d%-1s%n",
                                "| " + getFlightNO(), "| " + getDestination(), LAUNCHING_CELL, controlNumber + 1, "|    ", followTerminal(), "| ");
                        System.out.printf("%n%-11s%-21s%-25s%-5d%-1s%-5d%-1s%n",
                                "| " + getFlightNO(), "| " + getDestination(), BOARDING_CELL, controlNumber + 1, "|    ", followTerminal(), "| ");
                        Thread.sleep((int) (Math.random() * 10 + 1) * 2 * SPEED_BOARDING * getCapacity());
                        System.out.printf("%n%-11s%-21s%-25s%-5d%-1s%-5d%-1s%n",
                                "| " + getFlightNO(), "| " + getDestination(), FINAL_CALL_CELL, controlNumber + 1, "|    ", followTerminal(), "| ");
                        Thread.sleep((int) (Math.random() * 10 + 1) * 10);
                        System.out.printf("%n%-11s%-21s%-25s%-5d%-1s%-5d%-1s%n",
                                "| " + getFlightNO(), "| " + getDestination(), GATE_CLOSED_CELL, controlNumber + 1, "|    ", followTerminal(), "| ");
                        Thread.sleep((int) (Math.random() * 10 + 1) * 10);
                        System.out.printf("%n%-11s%-21s%-25s%-5d%-1s%-5d%-1s%n",
                                "| " + getFlightNO(), "| " + getDestination(), DEPARTED_CELL, controlNumber + 1, "|    ", followTerminal(), "| ");
                        System.out.println("|-----------------------------------------------------------------------|");
                        break;
                    }
            }
            Thread.sleep((int) (Math.random() * 10 + 1) * 1000);
            // Releasing the Gate
            synchronized (gate) {
                gate[controlNumber] = true;
            }
            // Releasing the resource
            airport.release();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
