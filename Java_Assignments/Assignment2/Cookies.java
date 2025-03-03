package Java_Assignments.Assignment2;

public class Cookies extends Dessert {
    
    public Cookies(){
        //super(count,fl);
        rates[0]=12;
        rates[1]=24;
        rates[2]=36;
        unit="dozen";
        fls[0]="Unibic";
        fls[1]="Oreo";
        fls[2]="Parle-G";
    }

    public int calculatePrice(int qty, int rate){
        return qty*rate/12;
    }

    public String toString(){
        return "Cookies";
    }
}
