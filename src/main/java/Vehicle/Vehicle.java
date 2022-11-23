package Vehicle;

import Vehicle.Air.Air;
import Vehicle.Land.Land;
import Vehicle.Water.Water;

import java.util.ArrayList;

public abstract class Vehicle {

    private int numberOfWheels;
    private int maxOccupancy;
    public enum typeOfFuel{
        petrol, diesel, electric, other, none
    } // unsure if i need to make an enum class or if I can do this
    // not sure how to implement enum into a property
    private int numberOfEngines;

    private ArrayList <Air> airVehicles;
    private ArrayList <Land> landVehicles;
    private ArrayList <Water> waterVehicles;



    public Vehicle(int numberOfWheels, int maxOccupancy, int numberOfEngines){
        this.numberOfWheels = numberOfWheels;
        this.maxOccupancy = maxOccupancy;
        this.numberOfEngines = numberOfEngines;

    }
    // methods

    // starting engine
    public String startEngine(){
        return "Lets go!";
    }

    // turning off engine
    public String stopEngine(){
        return "Engine is now off.";
    }

    // overload

    public String stopEngineWhenRocket(){
        return "Oh no! we are falling down to earth";
    }

    // getters and setters
    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaxOccupancy(){
        return this.maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy){
        this.maxOccupancy = maxOccupancy;
    }

    public int getNumberOfEngines(){
        return this.numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines){
        this.numberOfEngines = numberOfEngines;
    }


}
