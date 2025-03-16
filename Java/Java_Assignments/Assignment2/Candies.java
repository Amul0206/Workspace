package Java_Assignments.Assignment2;

public class Candies extends Dessert {

    public Candies( ){
        //super(count,fl);
        rates[0]=1000;
        rates[1]=2000;
        rates[2]=3000;
        unit="kg";
        fls[0]="Eclairs";
        fls[1]="Pulse";
        fls[2]="Alpanlibee";

    }

    public int calculatePrice(int qty, int rate){
        return 
        qty*rate/1000;
    }
    public String toString(){
        return "Candies";
    }
}
