package Java_Assignments.Assignment6;

import java.util.HashSet;

public class Song implements Comparable<Song> {
    private int serialNo;
    private String title;
    private HashSet<String> setOfArtists;
    private int releaseYear;
    private int rating;

    

    public Song(int serialNo, String title, HashSet<String> setOfArtists, int releaseYear, int rating) {
        this.serialNo = serialNo;
        this.title = title;
        this.setOfArtists = setOfArtists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public HashSet<String> getSetOfArtists() {
        return setOfArtists;
    }

    public void setSetOfArtists(HashSet<String> setOfArtists) {
        this.setOfArtists = setOfArtists;
    }



    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }



    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    

    @Override
    public String toString() {
        return "Song [serialNo=" + serialNo + ", title=" + title + ", setOfArtists=" + setOfArtists + ", releaseYear="
                + releaseYear + ", rating=" + rating + "]";
    }

    public void displayTitleYear() {
        System.out.println(title + " released in " + releaseYear); 
    }



    @Override
    public int compareTo(Song o) {
        return o.releaseYear-this.releaseYear;
    }
}