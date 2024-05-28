package Behavioral_patterns.Visitor;

public class BasketballClub implements SportClub{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBasketball(this);
    }

}
