package Behavioral_patterns.Command;

public class User {
    private Command add;
    private Command delete;
    private Command changeStatus;
    private Command changeRating;
    private Command addComment;


    public User(Command add, Command delete, Command changeStatus, Command changeRating, Command addComment){
        this.add = add;
        this.delete = delete;
        this.changeStatus = changeStatus;
        this.changeRating = changeRating;
        this.addComment = addComment;

    }
    public void addBook(){
        add.execute();
    }
    public void deleteBook(){
        delete.execute();
    }
    public void changeStatus(){
        changeStatus.execute();
    }
    public void changeRating(){
        changeRating.execute();
    }
    public void addComment(){
        addComment.execute();
    }

}
