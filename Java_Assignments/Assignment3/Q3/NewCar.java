package Java_Assignments.Assignment3.Q3;

import java.util.List;

import java.util.ArrayList;
import java.util.Date;

public class NewCar implements Cloneable {

    String make;
    String model;
    int price;
    private List<String> colors;
    private Date mandate;

    @Override
    public String toString() {
        return "NewCar [make=" + make + ", model=" + model + ", price=" + price + ", colors=" + colors + ", mandate="
                + mandate + "]";
    }

    public NewCar(String make, String model, int price, List<String> colors, Date mandate) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colors = colors;   
        this.mandate = mandate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Date getMandate() {
        return mandate;
    }

    public void setMandate(Date mandate) {
        this.mandate = mandate;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        NewCar car = new NewCar(make, model, price, colors, mandate);
        List<String> copy=new ArrayList<>();
        for(String c:colors){
            copy.add(c);
        }
        car.colors = copy;
        @SuppressWarnings("deprecation")
        Date d=new Date(this.getMandate().getYear(),this.getMandate().getMonth(),this.getMandate().getDate());
        car.mandate=d;
        return car;
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws CloneNotSupportedException {
        List <String> colors = List.of("Red", "Blue", "Green");
        NewCar c1 = new NewCar("Honda", "City", 10, colors  , new Date());
        NewCar c2 = null;
        c2 = (NewCar) c1.clone();   //DEEP COPY

        //c1.colors.set(0, "Yellow");
        List<String> colors1 = List.of("Yellow", "Blue", "Green");
        c1.setColors(colors1);
        c1.setMandate(new Date(2025, 12, 31));      
        System.out.println(c1);
        System.out.println(c2);
        
    }
}
