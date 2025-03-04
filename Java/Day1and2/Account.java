//USE OF STATIC

package Java.Day1and2;

public class Account {

    @SuppressWarnings("unused")
    private int accno, balance;
    @SuppressWarnings("unused")
    private String name;

    private static float intrate; //Static is used because it is the property of a class rather than a object...

    static{
        System.out.println("Block1");
        intrate = 6.5f;
    }
    
    static{
        System.out.println("Block2");
    }

    public Account(int accno, String name, int balance){
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void calculateInterest(){
        double interest = (balance * intrate)/4;
        System.out.println("Interest earned : " + interest);
    }

    public static void displayInterestRate(){
        System.out.println("Current Interest Rate: " + intrate);
    }
}
