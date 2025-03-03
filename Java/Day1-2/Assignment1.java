package JAVA;
import java.util.*;
class Assignment1{

    //FUNCTIONS

    public static int Factorial(int n1){
        if (n1==0 || n1==1) return 1;
        else return n1*Factorial(n1-1);
    }

    public static boolean isPrime(int n){

        if (n==1) return false;

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to check prime or calculate factorial: ");
        int num = sc.nextInt();

        System.out.println();

        System.out.println("Choose");
        System.out.println("1. check if n is prime.");
        System.out.println("2. Find n!");

        int n=sc.nextInt(); //Option
        
        if(n==1){
            System.out.println(isPrime(num));
        }
        else{
            System.out.println(Factorial(num)); 
        }
    }

    
}

