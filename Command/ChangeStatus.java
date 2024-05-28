package Behavioral_patterns.Command;

public class ChangeStatus implements Command{
    private Book book;
    public ChangeStatus(Book book){
        this.book = book;
    }
    @Override
    public void execute() {
        book.changeStatus();
    }

}
