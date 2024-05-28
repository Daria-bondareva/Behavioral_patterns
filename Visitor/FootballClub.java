package Behavioral_patterns.Visitor;

public class FootballClub implements SportClub{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFootball(this);
    }
}
