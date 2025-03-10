package Java.Day8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStream {
    public static void main(String[] args) {

        //Using range we get a stream
        IntStream.range(10, 30).forEach(System.out::println);

        //Stream to arr -> toArray()
        int [] arr=IntStream.range(10, 30).toArray();
        System.out.println("Array: "+Arrays.toString(arr));

        //Array to stream
        IntStream stream=Arrays.stream(arr);
        stream.limit(10).forEach(System.out::println);

        stream=Arrays.stream(arr);
        List<Integer> list=stream.map((n)->n/2).boxed().collect(Collectors.toList());
        System.out.println(list);

        stream=Arrays.stream(arr);
        String data=stream.filter((n)->n>20).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(data);

        stream=Arrays.stream(arr);
        stream.parallel().forEach((n->System.out.println(n*2)));

        stream=Arrays.stream(arr);
        stream.parallel().forEachOrdered((n->System.out.println(n*2)));

        stream=Arrays.stream(arr);
        int total=stream.parallel().reduce(0, (a,b)->a+b);
        System.out.println("Total: "+total);

        stream=Arrays.stream(arr);
        total=stream.sum();
        System.out.println("Total: "+total);

        stream=Arrays.stream(arr);
        OptionalInt min=stream.min();
        if(min.isPresent())  System.out.println("Min: "+min.getAsInt());

        stream=Arrays.stream(arr);
        OptionalInt max=stream.max();
        if(max.isPresent())  System.out.println("Max: "+max.getAsInt());
    }
}
