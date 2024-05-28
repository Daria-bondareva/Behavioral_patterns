package Behavioral_patterns.Visitor;

public class ExerciseVisitor implements Visitor{
    public void visitBasketball(BasketballClub basketballClub){
        System.out.println("Working out tactical schemes and combinations of throwing the ball.");

    }
    public void visitFootball(FootballClub footballClub){
        System.out.println("Work on the technique of passing, receiving the ball, dribbling, hitting the goal.");

    }
}
