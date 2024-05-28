package Behavioral_patterns.Command;

public class AddBook implements Command{
    private Book book;
    public AddBook(Book book){
        this.book = book;
    }
    @Override
    public void execute() {
        book.add();
    }

}
