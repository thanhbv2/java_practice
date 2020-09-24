package stratery;

public class StreetRace extends Vehicle {
    public StreetRace(){
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
