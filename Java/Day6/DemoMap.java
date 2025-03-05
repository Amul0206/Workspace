package Java.Day6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("aaa", 111);
        map.put("bbb", 222);
        map.put("ccc", 333);

        System.out.println(map.get("aaa"));

        //Entry Interface
        for (String k: map.keySet()){
            System.out.println(k + "->" + map.get(k));
        }

        Set<Entry<String, Integer>> entries = map.entrySet();
        for(Entry<String,Integer> e: entries){
            System.out.println(e.getKey()+ " -> " +e.getValue());
        }

    }
}
