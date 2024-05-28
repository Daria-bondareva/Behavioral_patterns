package Behavioral_patterns.State;

public class Project {
    public static void main(String[] args) {
        State stateWaiting = new Waiting();

        SetUp setUp = new SetUp(stateWaiting);
        setUp.doAction();

        State stateMakingCoffee = new MakingCoffee();
        setUp.setState(stateMakingCoffee);
        setUp.doAction();
    }
}
