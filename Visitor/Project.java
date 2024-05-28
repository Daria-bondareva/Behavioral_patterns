package Behavioral_patterns.Visitor;

public class Project {
    public static void main(String[] args) {


        BasketballClub basketballClub = new BasketballClub();
        FootballClub footballClub = new FootballClub();

        Visitor exerciseVisitor = new ExerciseVisitor();
        Visitor prepareVisitor = new PrepareForCompetitionVisitor();

        basketballClub.accept(exerciseVisitor);
        footballClub.accept(exerciseVisitor );
        System.out.println( "\n");

        basketballClub.accept(prepareVisitor);
        footballClub.accept(prepareVisitor);
    }
}
