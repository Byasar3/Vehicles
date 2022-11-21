package Vehicle.Land;

import Vehicle.Vehicle;

public abstract class Land extends Vehicle {

    private boolean isItClosedTop;

    public Land(int numberOfWheels, int maxOccupancy, int numberOfEngines, boolean isItClosedTop){
        super(numberOfWheels, maxOccupancy, numberOfEngines);
    }


}
