package Vehicle;

public abstract class Vehicle {

    private int numberOfWheels;
    private int maxOccupancy;
    public enum typeOfFuel{
        petrol, diesel, electric, other, none
    }
    private int numberOfEngines;
    public enum terrain{
        land, air, water
    }

    public Vehicle(int numberOfWheels, int maxOccupancy, int numberOfEngines){
        this.numberOfWheels = numberOfWheels;
        this.maxOccupancy = maxOccupancy;
        this.numberOfEngines = numberOfEngines;
    }
}
