package Java_Assignments.Assignment3.Q2;

public abstract class Vehicle {
    private String model;
    private String manufacturer;
    private String fuelType;
    private Policy policy;

    public Vehicle(String model, String manufacturer, int policyNumber, String policyHolder, String policyStartDate,
            int policyAmount, int period, String fuelType) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.fuelType = fuelType;
        this.policy = new Policy(policyNumber, policyHolder, policyStartDate, policyAmount, period);
    }

    public Policy getPolicy() {
        return policy;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getFuelType() {
        return fuelType;
    }
    
}
