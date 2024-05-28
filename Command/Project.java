package Behavioral_patterns.Command;

public class Project {
    public static void main(String[] args){
        Book book = new Book();
        Command add = new AddBook(book);
        Command delete = new DeleteBook(book);
        Command changeStatus = new ChangeStatus(book);
        Command changeRating = new ChangeRating(book);
        Command addCom = new AddComment(book);

        User user = new User(add, delete, changeStatus, changeRating, addCom);

        user.addBook();
        user.deleteBook();
        user.addComment();
    }
}
