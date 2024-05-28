package Behavioral_patterns.ObserverFirstVersion;


import java.util.ArrayList;
import java.util.List;

public class KCDBookhouse  {
    private List<KCDSubscriber> subscribers = new ArrayList<>();
    private List<String> books = new ArrayList<>();

    public void addSubscriber(KCDSubscriber subscriber) {
        subscribers.add(subscriber);
    }


    public void removeSubscriber(KCDSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(String text) {
        subscribers.forEach(subscriber -> subscriber.showNotification(text));
    }

    public void uploadNewBook(String bookTitle){
        books.add(bookTitle);
        notifySubscriber(bookTitle);
    }

}

