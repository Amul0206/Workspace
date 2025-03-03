package JAVA;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of array:");
        int length = sc.nextInt();
        int numbers[]= new int[length];

        System.out.println("Enter numbers you want to sort: ");
        //List of Numbers
        for (int i=0; i<=length-1; i++){
            int n = sc.nextInt();
            numbers[i]=n;
        }

        //Bubble Sort
        for(int j=0;j<numbers.length;j++){
            for (int i = 0; i<=numbers.length-2-j; i++){
                if (numbers[i]>numbers[i+1]){
                    int temp;
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }

        System.out.print("Srted array: ");
        
        for(int i=0; i<=numbers.length-1; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
