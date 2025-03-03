package Java.Day4.ObjectsEqualsHashcode;

//import java.util.Objects;

public class Car {
    private String make, model;
    private int price;
    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Make: " + make + " Model: " + model + " Price:piogu9ow4t sguid " + price;
    }

    public boolean equals(Object obj){
            Car c = (Car) obj;
            if(make.equals(c.make) && model.equals(c.model) && price == c.price){
                return true;
            }
        
        return false;
    }

    public int hashCode(){
        return 13+make.hashCode() + model.hashCode() + price;
    }

//     @Override
//     public boolean equals(Object obj) {
//         return Objects.equals(obj);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(make, model, price);
//     }
 }

