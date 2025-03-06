package Java.Day7;

import java.util.ArrayList;
import java.util.List;

public class DemoLambda {

    //Commonly used method in streams. It takes predicate and a number as input and returns a boolean.
    public static boolean operateOnNumber(Predicate p, int number) {
            return p.test(number);
        }

    //Commonly used method in streams. It takes predicate and a list of numbers as input and returns an integer.

    public static List<Integer> operateOnNumberList(Predicate p, List<Integer> numbers) {
        List<Integer> res= new ArrayList<Integer>();
        @SuppressWarnings("unused")
        int sum = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                res.add(number);
            }
        }
        return res;
     }

    //  public static List<Integer> operateOnNumberList(Function f, List<Integer> numbers) {
    //     List<Integer> res= new ArrayList<Integer>();
    //     for (int number : numbers) {
    //         res.add(f.apply(number));
    //     }

    public static ArrayList<Integer> operateOnSalaryList(Function f, List<Integer> numbers) {
        ArrayList<Integer> res= new ArrayList<Integer>();
        for (int number : numbers) {
            res.add(f.apply(number));
        }
        return res;
    }
        @SuppressWarnings("rawtypes")
        public static void main(NewPredicate[] args) {
    
            Predicate ispositive = (n) -> n > 0;
    
            System.out.println(ispositive.test(10));
            System.out.println(ispositive.test(-10));
    
            Predicate isprime = (n) -> {
                if (n <= 1)
                    return false;
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0)
                        return false;
                }
                return true;
            };
    
            // Function square = (n) -> n * n;
    
            // Function squareroot = (n) -> (int) Math.sqrt(n);
    
            // Function factorial = (n) -> {
            //     int fact = 1;
            //     for (int i = 1; i <= n; i++) {
            //         fact *= i;
            //     }
            //     return fact;
            // };
            
            System.out.println(isprime.test(10));
            System.out.println(isprime.test(13));

            // System.out.println(square.apply(10));
            // System.out.println(factorial.apply(5));
            // System.out.println(squareroot.apply(25));
    
            System.out.println(operateOnNumber((n) -> n % 2 == 0, 10));

            //isPrime is a predicate that checks if a number is prime or not.
            //operateOnNumber is a method that takes a predicate and a number as input and returns a boolean.

            System.out.println(operateOnNumber(isprime, 10));

            //Sum of prime numbers in a list.
            System.out.println("Prime numbers in the list are = " + operateOnNumberList(isprime, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));

            //Salary List
            System.out.println("Salary list = " + operateOnSalaryList((n) -> n >= 50000 ? n : 0, List.of(500000, 20000, 30000, 54000, 50000)));
    }
}