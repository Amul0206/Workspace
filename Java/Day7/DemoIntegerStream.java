package Java.Day7;

import java.util.ArrayList;
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

        /*
         * filter decide which elements to keep by given predicate
         * dropwhile decides which eleemnts to discard by given predicate
         * once the first element matching the predicate is found
         * dropwhile stop discarding elements(in an ordered stream)
         * in unordered stream, op is non determinsitic 
         */

        System.out.println("--------------filter vs dropWhile-----------------");
        stream=Arrays.stream(arr);
        //stream.filter((n)->n<20).forEach(System.out::println);
        List<Integer> filtered=stream.filter((n)->n<20).boxed().collect(Collectors.toList());
        System.out.println(filtered);

        stream=Arrays.stream(arr);
        List<Integer> dropped=stream.dropWhile((n)->n<20).boxed().collect(Collectors.toList());
        System.out.println(dropped);

        stream=Arrays.stream(arr);
        boolean matches=stream.allMatch((n)->n<20);
        System.out.println("All match: "+matches);

        stream=Arrays.stream(arr);
        matches=stream.anyMatch((n)->n<20);
        System.out.println("Any match: "+matches);

        System.out.println("----------------Flat map----------------------");
        List<List<Integer>> tdlst=new ArrayList<>();
        tdlst.add(Arrays.asList(1,2));
        tdlst.add(Arrays.asList(3,4));
        tdlst.add(Arrays.asList(5,6));
        tdlst.add(Arrays.asList(7,8));

        System.out.println("Before flat map: "+tdlst);
        Stream<Integer> istream= tdlst.stream().flatMap((lst)->lst.stream());
        List<Integer> flat=istream.collect(Collectors.toList());
        System.out.println("After flat map: "+flat);
    }
}
