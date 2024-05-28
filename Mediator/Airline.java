package Behavioral_patterns.Mediator;

public class Airline extends Partner{
    @Override
    public void send(String event) {
        mediator.notify(this,event);
    }

    @Override
    public void get(String message) {
        System.out.println("Airline receives: " + message);
    }
    public Airline(Mediator mediator){
        super(mediator);
    }
}
