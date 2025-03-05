package Java_Assignments.Assignment5;

public class Bank{

    public static void main(String[] args) {
        Account a1=new Account(0, 0, null);
        try{
            a1.withdrawMoney(20);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
            
        }
    }

}
