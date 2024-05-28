package Behavioral_patterns.Mediator;

public class Client extends Partner{
    @Override
    public void send(String event) {
        mediator.notify(this, event);
    }

    @Override
    public void get(String message) {
        System.out.println("Tourist receives: " + message);
    }
    public Client(Mediator mediator){
        super(mediator);
    }
}
