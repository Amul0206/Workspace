package Java_Assignments.Assignment8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToyStream {

    public static void main(String[] args) {
        ToyCompany collection=new ToyCompany();
        List<Toy> toylist=collection.initializedata();

        System.out.println("------------Stock List------------");
        Stream<Toy> stream=toylist.stream();
        toylist.stream().forEach(System.out::println);

        System.out.println("------------Filter the stock by category------------");
        stream=toylist.stream();
        stream.filter((toy)->toy.getCategory().equals("Educational")).forEach(System.out::println);

        System.out.println("------------List Toys by price range------------");
        stream=toylist.stream();
        stream.filter((toy)->toy.getPrice()>500 && toy.getPrice()<800).forEach(System.out::println);

        System.out.println("------------Sort the toys by price- category wise------------");
        stream=toylist.stream();
        Comparator<Toy> byPrice=Comparator.comparing(Toy::getPrice);
        Comparator<Toy> byCategory=Comparator.comparing(Toy::getCategory).thenComparing(byPrice);
        stream.sorted(byCategory).forEach(System.out::println);

        System.out.println("------------Make the list of old stock [older than 1 year]------------");
        stream=toylist.stream();
        stream.filter((toy)->toy.getPurchaseYear()<2024).forEach(System.out::println);

        System.out.println("------------Make a group of toys as per their category, count them------------");
        stream=toylist.stream();
        stream.collect(Collectors.groupingBy(Toy::getCategory)).forEach((k,v)->System.out.println(k+" : "+v.size()));

        System.out.println("------------most expensive/least expensive toy in given category------------");
        stream=toylist.stream();
        stream.collect(Collectors.groupingBy(Toy::getCategory)).forEach((k,v)->{
            System.out.println("Category: "+k);
            System.out.println("Most Expensive: "+v.stream().max(Comparator.comparing(Toy::getPrice)).get());
            System.out.println("Least Expensive: "+v.stream().min(Comparator.comparing(Toy::getPrice)).get());
        });
        
        System.out.println("------------total no of toys in stock for each age grp------------");
        stream=toylist.stream();
        stream.collect(Collectors.groupingBy(Toy::getAge)).forEach((k,v)->System.out.println(k+" : "+v.size()));
    
    }
}
