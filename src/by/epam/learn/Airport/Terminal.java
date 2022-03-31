package by.epam.learn.Airport;

public class Terminal {
    int terminalNumber;
    String typeByFlightRange;

    public Terminal(int terminalNumber, String typeByFlightRange) {
        this.terminalNumber = terminalNumber;
        this.typeByFlightRange = typeByFlightRange;
    }

    public int getTerminalNumber() {
        return terminalNumber;
    }

    public String getTypeByFlightRange() {
        return typeByFlightRange;
    }

    @Override
    public String toString() {
        return '\n' + "Terminal #: " + terminalNumber + "Terminal by Aircraft's flight range: " + typeByFlightRange;
    }
}