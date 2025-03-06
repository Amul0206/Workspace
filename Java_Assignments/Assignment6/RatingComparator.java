package Java_Assignments.Assignment6;

import java.util.Comparator;

public class RatingComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getRating() - o2.getRating();
    }

}
