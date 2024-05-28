package Behavioral_patterns.ChainOfResponsibility;

public class Project {
    public static void main(String[] args) {
        TaskHandler chain = setUpChain();

        chain.processRequest(SeverityOfTask.EASY);
        chain.processRequest(SeverityOfTask.MEDIUM);
        chain.processRequest(SeverityOfTask.HARD);
        chain.processRequest(SeverityOfTask.IMPOSSIBLE);

    }

    public static TaskHandler setUpChain(){
        TaskHandler easyHandler = new TaskForJunior();
        TaskHandler mediumHandler = new TaskForMiddle();
        TaskHandler hardHandler = new TaskForSenior();

        easyHandler.setSuccessor(mediumHandler);
        mediumHandler.setSuccessor(hardHandler);

        return easyHandler;
    }
}
