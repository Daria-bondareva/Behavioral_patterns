package Behavioral_patterns.ChainOfResponsibility;

public class TaskForSenior extends TaskHandler{
    @Override
    public void processRequest(SeverityOfTask request) {
        if (request == SeverityOfTask.HARD) {
            System.out.println("Senior handles " + request);
            System.out.println("Senior say: - 'Lol, easy. Come here'.\n");
        } else {
            System.out.println("Senior doesn't handle " + request+ ". It's just a strange task -_-");
            if (successor != null) {
                successor.processRequest(request);
            }
        }
    }
}
