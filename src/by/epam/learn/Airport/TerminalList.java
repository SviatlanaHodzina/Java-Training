package by.epam.learn.Airport;

import java.util.ArrayList;

public class TerminalList {

    static ArrayList<AircraftThread> aircrafts;
    ArrayList<Terminal> terminals;

    TerminalList(ArrayList<Terminal> terminals) {
        this.terminals = terminals;
    }

    public ArrayList<Terminal> getTerminals() {
        return terminals;
    }
}
