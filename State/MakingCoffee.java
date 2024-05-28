package Behavioral_patterns.State;

public class MakingCoffee implements State{
    @Override
    public void doAction() {
        System.out.println("Making coffee mode is set up");
    }
}
