package Java_Assignments.Assignment8;

import java.util.Date;
import java.util.HashSet;

public class Tweet {
    String subject;
    int date;
    int views;
    HashSet<String> hashtags;
    public Tweet(String subject, int date, int views, HashSet<String> hashtags) {
        this.subject = subject;
        this.date = date;
        this.views = views;
        this.hashtags = hashtags;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public HashSet<String> getHashtags() {
        return hashtags;
    }
    public void setHashtags(HashSet<String> hashtags) {
        this.hashtags = hashtags;
    }
    public Object getHashtag() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHashtag'");
    }
    
}
