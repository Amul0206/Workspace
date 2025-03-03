package Java.Day3.InheritanceInsurance;

public abstract class Vehicle {

    protected int regno;
    protected String make;
    protected String model;
    protected double price;

    public Vehicle(int regno, String make, String model, double price){
        this.regno = regno;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    abstract double calculateInsurance();

    


}
