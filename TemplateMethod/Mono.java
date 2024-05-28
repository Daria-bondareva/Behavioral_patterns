package Behavioral_patterns.TemplateMethod;

public class Mono extends Payment{
    @Override
    protected void validatePayment() {
        System.out.println("MonoBank validates the correctness of the payment...");
    }

    @Override
    protected void processPayment() {
        System.out.println("MonoBank processes the payment...");
    }

    @Override
    protected void confirmPayment() {
        System.out.println("Paid successfully in Mono:)");
    }
}
