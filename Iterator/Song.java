package Behavioral_patterns.Iterator;

public class Song {
    String name;
    String author;
    public Song(String name, String author){
        this.name = name;
        this.author = author;
    }
    public String toString(){
        return name + " - " + author;
    }
}
