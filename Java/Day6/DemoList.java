package Java.Day6;

import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;

public class DemoList {
   public static void main(String[] args) {
        List<Object> lst = new ArrayList<>();
        
        lst.add(434);
        lst.add("ABC");
        lst.add(true);
        lst.add(23.5f);

        int j = (Integer)lst.get(2);
        System.out.println(j);

        lst.remove(1);

        /*
         * List Iteration Methods:- 
         * 1. Using for loop
         * 2. Using for...each loop
         * 3. Using iterator
         */

        for(int i=0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }

        for (Object o: lst){
            System.out.println(o);
        }

        // Iterator it = lst.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //List<Object> linkedLst = new LinkedList<>();

        
   }    
}