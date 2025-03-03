package Java.Day3.InheritanceInsurance;

public class TwoWheeler extends Vehicle {

    TwoWheeler(int regno, String make, String model, double price){
        super(regno, make, model, price);
    }

    @Override
    double calculateInsurance() {
        // TODO Auto-generated method stub
        return price*0.05;
    }
}
