package Behavioral_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class KCDBookhouse implements Bookhouse{
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<String> books = new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
    subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String text) {
    subscribers.forEach(subscriber -> subscriber.showNotification(text));
    }

    public void uploadNewBook(String bookTitle){
        books.add(bookTitle);
        notifySubscriber(bookTitle);
    }

}
