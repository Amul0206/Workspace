package Java_Assignments.Assignment2;

public class Icecream extends Dessert {

    public Icecream( ){
        //super(count,fl);
        rates[0]=10;
        rates[1]=20;
        rates[2]=30;
        unit="piece";
        fls[0]="Vanilla";
        fls[1]="Chocolate";
        fls[2]="Butterscotch";
    }
    public int calculatePrice(int qty, int rate){
        return qty*rate;
    }
    public String toString(){
        return "IceCream";
    }
}

