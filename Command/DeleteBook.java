package Behavioral_patterns.Command;

public class DeleteBook implements Command{
    private Book book;
    public DeleteBook(Book book){
        this.book = book;
    }
    @Override
    public void execute() {
        book.delete();
    }

}
