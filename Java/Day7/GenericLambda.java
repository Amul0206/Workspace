// package Java.Day7;

// public class GenericLambda{

//     public static <T> boolean operateOnData(NewPredicate<T> p, T data) {
//         return p.test(data);
//     }

//     public static void main(String[] args) {
//         boolean res = operateOnData((s) -> s.endsWith("lambda"), "GenericLambda");
//         System.out.println(res);

//         res = operateOnData((n)->n%10==0, 100);
//         System.out.println(res);

//         res = operateOnData(NewPredicate::isPrime, 7);
//         System.out.println(res);
//         }
    
//     res = operateOnData((Character c) -> Character.isUpperCase(c), 'A');
//     System.out.println(res);
// }                                                                                                                                                                                          