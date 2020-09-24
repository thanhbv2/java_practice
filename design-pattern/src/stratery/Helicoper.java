package stratery;

public class Helicoper extends Vehicle {
    public Helicoper(){
        setGoAlgorithm(new GoByFlying());
    }
}

