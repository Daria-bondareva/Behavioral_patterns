package Behavioral_patterns.Observer;

public class KCDSubscriber implements Subscriber{
    @Override
    public void showNotification(String text) {
        System.out.println("Hey! You should check out the new book: "+ text);
    }
}
