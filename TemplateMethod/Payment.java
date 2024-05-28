package Behavioral_patterns.TemplateMethod;

abstract class Payment {
    public final void pay(){
        validatePayment();
        processPayment();
        confirmPayment();
    }
    protected abstract void validatePayment();
    protected abstract void processPayment();
    protected void confirmPayment(){
        System.out.println("paid successfully!;)");
    };

}
