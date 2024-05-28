package Behavioral_patterns.Command;

public class AddComment implements Command {
    private Book book;
    public AddComment(Book book){
        this.book = book;
    }
    @Override
    public void execute() {
        book.addComment();
    }
}
