//USE OF STATIC

package JAVA;

public class Account {

    private int accno, balance;
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
