package JAVA;

/* 
 *Static methods are accessed as classname.method name.
 * They Represent behavior of a class rather than object.
 */

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account(1234, "aaa", 60000);
        Account acc2 = new Account(5678, "bbb", 80000);

        Account.displayInterestRate();

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
   
}
