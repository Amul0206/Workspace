package PRACTICE;
//import java.util.*;
//import java.io.*;

public class TransposeofaMatrix {

    //int [] numbers = {1,2,3,4,5};

    //ArrayList<String> cars = new ArrayList<String>();

    //Multidimensional Arrays

    //SQUARE MATRIX TRANSPOSE

    static final int n = 2;

    public static void transpose(int A[][], int B[][]){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                B[i][j] = A[j][i];
            }
        }
    }

    public static void main(String[] args) {
        
        //int [][] arr = new int[10][20];
        //arr[0][0] = 1;

        //System.out.println("1st element = " + arr[0][0]);

        int A[][] = {{1, 2, 3, 4}};
        int B[][] = new int[n][n];

        transpose(A, B);
    
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}