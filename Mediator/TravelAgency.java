package Behavioral_patterns.Mediator;

public class TravelAgency extends Partner{
    @Override
    public void send(String event) {
        mediator.notify(this, event);
    }

    @Override
    public void get(String message) {
        System.out.println("Tour Agency receives: " + message);
    }
    public TravelAgency(Mediator mediator){
        super(mediator);
    }
}
