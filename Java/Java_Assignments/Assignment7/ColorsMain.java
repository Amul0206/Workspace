package Java_Assignments.Assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Java.Day1and2.Array;

@SuppressWarnings("unused")
public class ColorsMain  {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        List colors=new ArrayList<String>(Arrays.asList("Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"));
        
        //Create list of colors in Uppercase and lowercase
        System.out.println("List of uppercase:");
        Colors c = (List<String> color) -> {
            List<String> result = new ArrayList<String>();
            for (String s : color) {
                result.add(s.toUpperCase());
            }
            return result;
        };
        System.out.print(c.apply(colors));
        System.out.println();

        System.out.println("List of lowercase:");
        Colors c1 = (List<String> color) -> {
            List<String> result = new ArrayList<String>();
            for (String s : color) {
                result.add(s.toLowerCase());
            }
            return result;
        };
        System.out.print(c.apply(colors));
        System.out.println();

        //Create a list of colors less than "m" in ascending order
        System.out.println("List of colors less than 'm' in ascending order:");
        Colors c2 = (List<String> color) -> {
            List<String> result = new ArrayList<String>();
            for (String s : color) {
                if (s.compareTo("m") < 0) {
                    result.add(s);
                }
            }
            result.sort((String s1, String s2) -> s1.compareTo(s2));
            return result;
        };
        System.out.print(c2.apply(colors));
        System.out.println();

        //Create a list of colors less than "m" in descending order
        System.out.println("List of colors less than 'm' in descending order:");
        Colors c3 = (List<String> color) -> {
            List<String> result = new ArrayList<String>();
            for (String s : color) {
                if (s.compareTo("m") < 0) {
                    result.add(s);
                }
            }
            result.sort((String s1, String s2) -> s2.compareTo(s1));
            return result;
        };
        System.out.print(c3.apply(colors));
        System.out.println();

        //Create a list of colors with 5 alphabets' of less in ascending order
        System.out.println("List of colors with 5 alphabets' of less in ascending order:");
        Colors c4 = (List<String> color) -> {
            List<String> result = new ArrayList<String>();
            for (String s : color) {
                if (s.length() < 5) {
                    result.add(s);
                }
            }
            result.sort((String s1, String s2) -> s1.compareTo(s2));
            return result;
        };
        System.out.print(c4.apply(colors));
        System.out.println();

        //Create a list of colors with 5 alphabets  of less in descending order
        System.out.println("List of colors with 5 alphabets' of less in descending order:");
        Colors c5 = (List<String> color) -> {
            List<String> result = new ArrayList<String>();
            for (String s : color) {
                if (s.length() < 5) {
                    result.add(s);
                }
            }
            result.sort((String s1, String s2) -> s2.compareTo(s1));
            return result;
        };
        System.out.print(c5.apply(colors));
        System.out.println();
    }
}
