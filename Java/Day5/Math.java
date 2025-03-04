package Java.Day5;

import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
        try{
            //int num1 = Integer.parseInt(args[0]);
            //int num2 = Integer.parseInt(args[1]);

            //int num1 = 9;
            int num1;
            Scanner sc = new Scanner(System.in);
            num1  = sc.nextInt();
            int num2 = 0;

            int res = num1/num2;

            System.out.println(res);

            sc.close();
        }

        catch(ArithmeticException e){
            
            System.out.println(e);
            System.out.println("THis is division by zero exception. Cannot divde by 0.");
        }

        catch(NumberFormatException e){
            e.printStackTrace();
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } 
    }
}
