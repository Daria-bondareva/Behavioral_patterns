package Behavioral_patterns.Mediator;

abstract class Partner {
    protected Mediator mediator;
    public Partner(Mediator mediator){
        this.mediator= mediator;
    }
    public abstract void send(String event);
    public abstract void get(String message);

}
