package Vehicle.Water;

import Vehicle.Vehicle;

public abstract class Water extends Vehicle {

    private boolean doesItGoUnderwater;

    public Water(int numberOfWheels, int maxOccupancy, int numberOfEngines, boolean doesItGoUnderwater){
        super(numberOfWheels, maxOccupancy, numberOfEngines);
    }
}
