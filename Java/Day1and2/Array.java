package Java.Day1and2;

public class Array {

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.pow(num, 0.5); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5}; 
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

       
        //For...Each loop
        int count = 0 ;
        for(int x : arr){
            if (isPrime(x)) count++;
        }
        System.out.println(count);

        Date [] darr = new Date[2];
        darr[0] = new Date();
        darr[1] = new Date();
        darr[0].setDay(1);
        darr[1].setDay(2);

        for(int i=0; i<darr.length; i++){
            System.out.println(darr[i]);
        }
    }
    
}
