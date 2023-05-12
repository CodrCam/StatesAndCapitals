package statesandcapitals;

public class StatePair {
    private StateInfo state1;
    private StateInfo state2;
    private int elevationDifference;

    // Constructor
    public StatePair(StateInfo state1, StateInfo state2) {
        this.state1 = state1;
        this.state2 = state2;
        this.elevationDifference = Math.abs(state1.getHighestElevationInFeet() - state2.getHighestElevationInFeet());
    }

    // Getters
    public StateInfo getState1() {
        return this.state1;
    }

    public StateInfo getState2() {
        return this.state2;
    }

    public int getElevationDifference() {
        return this.elevationDifference;
    }
}
