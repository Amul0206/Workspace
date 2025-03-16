package Java_Assignments.Assignment5;

public class Account {

    protected  int accId;
    protected  float accBal;
    protected  String accHolder;

    public int getAccId() {
        return accId;
    }

    public Account(int accId, float accBal, String accHolder){
        this.accId = accId;
        this.accBal = accBal;
        this.accHolder = accHolder;
    }

    public void depositMoney(float amount){
        if (amount<=0){
            System.out.println("Amount must be positive.");
        }

        accBal+=amount;

        System.out.println("New Balance = " + accBal);
    }

    public void withdrawMoney(float amount) throws InsufficientBalanceException{

        if (amount<=0){
            throw new IllegalArgumentException("Amount must be positive.");
        }

        if (amount>accBal){
            throw new InsufficientBalanceException("You don't have enough funds in your account.");
        }

        accBal-=amount;

        System.out.println("New Balance = " + accBal);
    }
}
