package Behavioral_patterns.ChainOfResponsibility;

public abstract class TaskHandler {
    TaskHandler successor;
    public  void setSuccessor(TaskHandler successor){
        this.successor = successor;
    }
    public  abstract  void processRequest(SeverityOfTask request);
}
