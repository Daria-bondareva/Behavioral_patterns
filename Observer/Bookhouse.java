package Behavioral_patterns.Observer;

public interface Bookhouse {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscriber(String text);

}
