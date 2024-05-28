package Behavioral_patterns.ChainOfResponsibility;

public class TaskForJunior extends TaskHandler{
    @Override
    public void processRequest(SeverityOfTask request) {
        if (request == SeverityOfTask.EASY) {
            System.out.println("Junior handles " + request);
            System.out.println("Junior say: -'Yeeeep, I can take it' .\n");
        } else {
            System.out.println("Junior doesn't handle " + request);
            if (successor != null) {
                successor.processRequest(request);
            }
        }
    }
}
