package Behavioral_patterns.Command;

public class ChangeRating implements Command {
    private Book book;
    public ChangeRating(Book book){
        this.book = book;
    }
    @Override
    public void execute() {
        book.changeRating();
    }

}
