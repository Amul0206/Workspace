package Java.Day8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) {
        String [] greetings={"Hello", "Hi", "Hola", "Bonjour", "Namaste", "Salaam", "Konnichiwa", "Ciao", "Shalom", "Merhaba"};

        Stream <String> stream=Arrays.stream(greetings);

        Optional<Integer> largest=stream.map(String::length).max(Integer::compareTo);
        largest.ifPresent((n)->System.out.println("Largest greeting: "+n));

        stream=Arrays.stream(greetings);
        Optional<String> longest=stream.max((a,b)->a.length()-b.length());
        longest.ifPresent(System.out::println);

        stream=Arrays.stream(greetings);
        Optional<String> longestt=stream.reduce((a,b)->a.length()>b.length()?a:b);
        longestt.ifPresent(System.out::println);
    }
}
