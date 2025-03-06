package Java_Assignments.Assignment6;

import java.util.*;
import java.time.Year;

public class Spotify {

    static ArrayList<Song> songs = new ArrayList<Song>();
    static HashMap<String, ArrayList<Song>> artistMap = new HashMap<String, ArrayList<Song>>();

    static void displaySongs(ArrayList<Song> songs) {
        for (Song song : songs) {
            System.out.println(song.getTitle() + " by " + song.getSetOfArtists() + " released in " + song.getReleaseYear()
                    + " with rating " + song.getRating());
        }
    }

    static ArrayList<Song> extendBinarySearchYear(int found){
        ArrayList<Song> result = new ArrayList<Song>();
        int i=found-1;
        while(i>=0 && songs.get(i).getReleaseYear()==songs.get(found).getReleaseYear()){
            result.add(songs.get(i));
            i--;
        }
        result.add(songs.get(found));
        i=found+1;
        while(i<songs.size() && songs.get(i).getReleaseYear()==songs.get(found).getReleaseYear()){
            result.add(songs.get(i));
            i++;
        }
        return result;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        songs.add(new Song(1, "not like us",new HashSet<String>(Arrays.asList("Kendrick Lamar","Drake")), 2024, 1 ));
        songs.add(new Song(2, "beleiver", new HashSet<String>(Arrays.asList("Imagine Dragons")), 2025, 4));
        songs.add(new Song(3, "lean on", new HashSet<String>(Arrays.asList("dj snake","major lazor")), 2019, 3));
        songs.add(new Song(4, "die with a smile", new HashSet<String>(Arrays.asList("Bruno Mars","lady gaga")), 2025, 2));
        songs.add(new Song(5, "senorita", new HashSet<String>(Arrays.asList("Camilla Cabello","shawn mendes","lady gaga")), 2025, 5));
        songs.add(new Song(5, "how fast the night changes", new HashSet<String>(Arrays.asList("Zayn Malik","Louis Thomas")), 2023, 5));

        //creatring artist map
        for(Song s:songs){
            for(String artist:s.getSetOfArtists()){
                if(artistMap.containsKey(artist.toLowerCase())){
                    artistMap.get(artist.toLowerCase()).add(s);
                }
                else{
                    ArrayList<Song> temp = new ArrayList<Song>();
                    temp.add(s);
                    artistMap.put(artist.toLowerCase(), temp);
                }
            }
        }

        //1 Display list of the songs
        System.out.println("Display list of the songs:");
        displaySongs(songs);
        System.out.println();

        //2 Sort songs by title
        System.out.println("Sort songs by title");
        Collections.sort(songs, new NameComparator());
        displaySongs(songs);
        System.out.println();

        //3 Sort songs for release year (latest first)
        System.out.println("Sort songs for release year (latest first):");
        Collections.sort(songs);
        displaySongs(songs);
        System.out.println();

        //4 Search song by title
        System.out.println("Search song by title: lean on");
        Collections.sort(songs, new NameComparator());
        int found=Collections.binarySearch(songs, new Song(0, "lean on", null, 0, 0), new NameComparator());
        if(found>=0)
            System.out.println(songs.get(found));
        else
            System.out.println("Song not found");
        System.out.println();

        //5 Create a list of songs released in the current year
        System.out.println("Create a list of songs released in the current year:");
        ArrayList<Song> year_result = new ArrayList<Song>();
        int found1=Collections.binarySearch(songs, new Song(0, null, null,Year.now().getValue() , 0));
        if(found1>=0)
         displaySongs(extendBinarySearchYear(found1));
        else
            System.out.println("Song not found");
        System.out.println();

        //6 Create a list of songs by specific artist
        System.out.println("Create a list of songs by specific artist: lady gaga");
        String artist="lady gaga";
        displaySongs(artistMap.get(artist));
        System.out.println();

        //7 Create a listing to show song title and release year
        System.out.println("Create a listing to show song title and release year:");
        for(Song song:songs){
            song.displayTitleYear();
        }
        System.out.println();

        //8 Display the song with lowest and highest rating
        System.out.println("Display the song with lowest and highest rating:");
        ArrayList<Song> min = new ArrayList<Song>();
        ArrayList<Song> max = new ArrayList<Song>();
        for(Song song:songs){

            if(song.getRating()==1){
                min.add(song);
            }
            if(song.getRating()==5){
                max.add(song);
            }
        }
        displaySongs(min);
        displaySongs(max);

    }
}
