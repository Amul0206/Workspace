package Java.Day1and2;

public class MethodOverloading {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a , int b, int c){
        return a+b+c;
    }

    //VARIABLE ARGUEMENTS

    public static long addition(int... a){
        long res = 0;
        for (int i:a){
            res = res+i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addition(1,2,3,4));
        System.out.println(addition(5,6,7,8,8,9,1));
        
    }
}
