package Java_Assignments.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank{

    static ArrayList <Account> accounts; 

    static Account fetchAccount (int accNum) throws InvalidAccountNumber{
        for(Account a:accounts){
            if(a.getAccId()==accNum) return a;
        }
        throw new InvalidAccountNumber("Your account number is invalid!");
    }


    public static void main(String[] args) {

        accounts = new ArrayList<Account>(Arrays.asList(new Account(1, 2000, "PQR"), new Account(2, 3000, "ABC")));
        ArrayList <Integer> withdrawalAmount = new ArrayList <Integer>(Arrays.asList(2500, 2000));
        ArrayList<Integer> user_in=new ArrayList<>(Arrays.asList(1,3));
        for(int i=0;i<accounts.size();i++){
            try{
                fetchAccount(user_in.get(i)).withdrawMoney(withdrawalAmount.get(i));
            }  
            catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
            catch(InvalidAccountNumber e){
                System.out.println(e.getMessage());
            }   
        }
        
    }
}
