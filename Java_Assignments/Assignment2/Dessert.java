package Java_Assignments.Assignment2;

public abstract class Dessert {

    int [] rates=new int[3];
    String [] fls = new String[3];     //Flavours for FoodItems
    String unit;

    public int[] getRates() {
        return rates;
    }

    public String[] getFls() {
        return fls;
    }

    public String getUnit() {
        return unit;
    }

    public abstract int calculatePrice(int qty, int rate);

    public void info(){
        System.out.println("Price per "+unit+":");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+". "+fls[i]+": "+rates[i]);
        }
    }

    public abstract String toString();
}
