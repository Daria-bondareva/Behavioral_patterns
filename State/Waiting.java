package Behavioral_patterns.State;

public class Waiting implements State{

    @Override
    public void doAction() {
        System.out.println("Waiting mode is set up");
    }
}
