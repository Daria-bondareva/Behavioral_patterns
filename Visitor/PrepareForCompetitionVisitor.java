package Behavioral_patterns.Visitor;

public class PrepareForCompetitionVisitor implements Visitor{
    public void visitBasketball(BasketballClub basketballClub){
        System.out.println("Work on the technique of passing, receiving the ball, dribbling, throwing.");

    }
    public void visitFootball(FootballClub footballClub){
        System.out.println("Conducting friendly matches to practice team play.");

    }
}
