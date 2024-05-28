package Behavioral_patterns.TemplateMethod;

public class PrivatBank extends Payment{
    @Override
    protected void validatePayment() {
        System.out.println("PrivatBank validates the correctness of the payment...");
    }

    @Override
    protected void processPayment() {
        System.out.println("PrivatBank processes the payment...");
    }
}
