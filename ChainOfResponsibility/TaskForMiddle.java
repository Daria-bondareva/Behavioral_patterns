package Behavioral_patterns.ChainOfResponsibility;

public class TaskForMiddle extends TaskHandler{
    @Override
    public void processRequest(SeverityOfTask request) {
        if (request == SeverityOfTask.MEDIUM) {
            System.out.println("Middle handles " + request);
            System.out.println("Middle say: 'I do it!'.\n");
        } else {
            System.out.println("Middle doesn't handle " + request);
            if (successor != null) {
                successor.processRequest(request);
            }
        }
    }
}
