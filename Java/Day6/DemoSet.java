package Java.Day6;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        
        HashSet<String> set1 = new HashSet<>();

        set1.add("Java");
        set1.add("C");
        set1.add("C++");
        set1.add("Python");

        System.out.println(set1);

        for (String s : set1){
            System.out.println(s);
        }

        System.out.println();

        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(25);
        set2.add(45);
        set2.add(10);
        set2.add(100);
        set2.add(35);

        System.out.println(set2);
    }
}