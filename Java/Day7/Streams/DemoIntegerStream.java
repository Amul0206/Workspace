package Java.Day7.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {
    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,5,6,7,8,9,10};

        Stream<Integer> stream=Arrays.stream(arr);

        List<Integer> list = Arrays.asList(arr);
        stream=list.stream();

        System.out.println("--------------find unique elements-----------------");
        long unique=stream.distinct().count();
        System.out.println("Unique elements: "+unique);

        System.out.println("--------------Sorting-----------------");
        stream=list.stream();
        List<Integer> sorted=stream.distinct().sorted().collect(Collectors.toList());
        System.out.println("Sorted elements: "+sorted);

        System.out.println("--------------Mapping-----------------");
        stream=list.stream();
        stream.distinct().map((n)->Math.sqrt(n)).forEach(System.out::println);

        System.out.println("--------------Filtering-----------------");
        stream=list.stream();
        stream.distinct().filter((n)->n%2==0).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("--------------Reduce-----------------");
        stream=list.stream();
        Optional<Integer> total=stream.reduce((a,b)->a+b);
        if(total.isPresent())   System.out.println(total.get());

        System.out.println("--------------min/max/average-----------------");
        stream=list.stream();
        Optional<Integer> min=stream.min(Integer::compareTo);
        if(min.isPresent())   System.out.println("Min: "+min.get());

        stream=list.stream();
        Optional<Integer> max=stream.max(Integer::compareTo);
        if(max.isPresent())   System.out.println("Max: "+max.get());

        stream=list.stream();
        OptionalDouble avg=stream.distinct().mapToDouble(Double::valueOf).average();
        if(avg.isPresent())   System.out.println("Average: "+avg.getAsDouble());

        

    }
}
