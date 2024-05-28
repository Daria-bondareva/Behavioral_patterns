package Behavioral_patterns.State;

public class CleaningMode implements State{
    @Override
    public void doAction() {
        System.out.println("Cleaning mode is set up");
    }
}
