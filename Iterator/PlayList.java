package Behavioral_patterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayList {
    List<Song> playList;
    public PlayList(){
        playList = new ArrayList<>();
    }
    public void addSong(Song song){
        playList.add(song);
    }
    public Iterator<Song> iterator(){
        return new PlayListIterator();
    }
    class PlayListIterator implements Iterator<Song>{
        int currentIndex = 0;
        @Override
        public boolean hasNext() {

            if(currentIndex >= playList.size()){
                return false;
            }else{
                return true;
            }
        }

        @Override
        public Song next() {
            return playList.get(currentIndex++);
        }

        @Override
        public void remove() {
            playList.remove(--currentIndex);
        }
    }
}
