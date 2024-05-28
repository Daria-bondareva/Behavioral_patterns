package Behavioral_patterns.State;

public class SetUp {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public SetUp(State state) {
        this.state = state;
    }

    public  void doAction(){
        state.doAction();
    }
}
