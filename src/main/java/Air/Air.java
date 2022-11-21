package Air;

import Vehicle.Vehicle;

public abstract class Air extends Vehicle {

    private boolean isItCommercial;
    private boolean doesItGoIntoSpace;

    public Air(int numberOfWheels, int maxOccupancy, int numberOfEngines, boolean isItCommercial, boolean doesItGoIntoSpace){
        super(numberOfWheels, maxOccupancy, numberOfEngines);
    }
}
