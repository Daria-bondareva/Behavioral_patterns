package Behavioral_patterns.State;

public class TurningOff implements State{
    @Override
    public void doAction() {
        System.out.println("Turning off mode is set up");
    }
}
