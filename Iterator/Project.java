package Behavioral_patterns.Iterator;

import java.util.Iterator;

public class Project {
    public static void main(String[] args){
        Song song1 = new Song("Afraid","The Neighbourhood");
        Song song2 = new Song("Pepas", "Farruko");
        Song song3 = new Song("When We`re High", "LP");

        PlayList playList = new PlayList();
        playList.addSong(song1);
        playList.addSong(song2);
        playList.addSong(song3);

        System.out.println("Displaying Playlist: ");
        Iterator<Song> iterator = playList.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song);
        }

        System.out.println("\nRemoving last song returned");
        iterator.remove();

        System.out.println("\nDisplaying Playlist:");
        iterator = playList.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song);
        }
    }
}
