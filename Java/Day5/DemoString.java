package Java.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoString {

    //@SuppressWarnings("unused")

    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";
        
        String n1 = new String("java");
        String n2 = new String("java");

        if(s1==s2)System.out.println("Strings are equal.");
        
        if (n1==n2)System.out.println("String objects are equal.");

        if (n1.equals(n2))System.out.println("String Ojects are equal using .equals()");

        s1.toLowerCase();
        System.out.println(s1.toLowerCase());

        System.out.println(s1.getBytes()); //[B@372f7a8d

        System.out.println(s1);
        System.out.println(s1.substring(1, 6));

        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("red");

        String c = String.join(",", colors);
        System.out.println(c);

        //String Array
        String [] cols = c.split(",");
        System.out.println(cols); //Output ---> [Ljava.lang.String;@2f92e0f4
        System.out.println(Arrays.toString(cols));  //Output---> [black, red]
    }


}
