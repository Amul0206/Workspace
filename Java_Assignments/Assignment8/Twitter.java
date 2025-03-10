package Java_Assignments.Assignment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Twitter {

        public List<Tweet> initializedata(){

        List<Tweet> tweetlist=new ArrayList<>();
        
        Tweet t1= new Tweet("Subject1", 10, 100, new HashSet<String>());
        Tweet t2= new Tweet("Subject2", 20, 200, new HashSet<String>());
        Tweet t3= new Tweet("Subject3", 30, 300, new HashSet<String>());
        Tweet t4= new Tweet("Subject4", 40, 400, new HashSet<String>());
        Tweet t5= new Tweet("Subject5", 50, 500, new HashSet<String>());
        Tweet t6= new Tweet("Subject6", 60, 600, new HashSet<String>());

        tweetlist.add(t1);
        tweetlist.add(t2);
        tweetlist.add(t3);
        tweetlist.add(t4);
        tweetlist.add(t5);
        tweetlist.add(t6);
        
        return tweetlist;

    }
}
