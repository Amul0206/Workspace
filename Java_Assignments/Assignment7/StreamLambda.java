package Java_Assignments.Assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLambda {
        
    public static void main(String[] args) {

        List<String> colors=new ArrayList<String>(Arrays.asList("Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"));
        //List<Integer> list = Arrays.asList(arr);
        Stream<String> stream=colors.stream();

        System.out.println("----------------------Colors starting with UpperCase----------------------");
        stream=colors.stream();
        stream.filter((n)->Character.isUpperCase(n.charAt(0))).forEach(System.out::println);

        System.out.println("----------------------Colors starting with LowerCase----------------------");
        stream=colors.stream();
        stream.filter((n)->Character.isLowerCase(n.charAt(0))).forEach(System.out::println);

        System.out.println("----------------------colors less than \"m\" in ascending order----------------------");
        stream=colors.stream();
        stream.filter((n)->n.toLowerCase().compareTo("m")<0).sorted(String::compareToIgnoreCase).forEach(System.out::println);

        System.out.println("----------------------colors less than \"m\" in descending order----------------------");
        stream=colors.stream();
        stream.filter((n)->n.toLowerCase().compareTo("m")<0).sorted((a,b)->b.toLowerCase().compareTo(a.toLowerCase())).forEach(System.out::println);

        System.out.println("----------------------colors with 5 alphabets or less in ascending order----------------------");
        stream=colors.stream();
        stream.filter((n)->n.toLowerCase().length()<6).sorted(String::compareToIgnoreCase).forEach(System.out::println);

        System.out.println("----------------------colors with 5 alphabets or less in descending order----------------------");
        stream=colors.stream();
        stream.filter((n)->n.toLowerCase().length()<6).sorted((a,b)->b.toLowerCase().compareTo(a.toLowerCase())).forEach(System.out::println);

        System.out.println("----------------------colors with 5 alphabets or less in ascending order and first letter in uppercase----------------------");
        

    }
}
