package Java_Assignments.Assignment8;

import java.util.List;
import java.util.stream.Collectors;

public class TweetStream {
    public static void main(String[] args) {
        Twitter collection=new Twitter();
        List<Tweet> tweetlist=collection.initializedata();

        System.out.println("------------all the tweets that are posted in current month------------");
        tweetlist.stream().filter((tweet)->tweet.getDate().getMonthValue() == java.time.Month.FEBRUARY.getValue()).forEach(System.out::println);

        System.out.println("------------all the tweets for a perticular hashtag------------");
        tweetlist.stream().filter((tweet)->tweet.getHashtags().contains("#java")).forEach(System.out::println);

        System.out.println("------------Count the tweets by Subject------------");
        tweetlist.stream().collect(Collectors.groupingBy(Tweet::getSubject)).forEach((k,v)->System.out.println(k+" : "+v.size()));

        System.out.println("------------tweets that got more than 10k views------------");
        tweetlist.stream().filter((tweet)->tweet.getViews()>10000).forEach(System.out::println);

        System.out.println("------------Print the top 5 trending tweets------------");
        tweetlist.stream().sorted((t1,t2)->t2.getViews()-t1.getViews()).limit(5).forEach(System.out::println);
    }
}
