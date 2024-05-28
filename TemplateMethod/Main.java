package Behavioral_patterns.TemplateMethod;

public class Main {
    public  static void main(String []args){
        Payment privatBank = new PrivatBank();
        privatBank.pay();
        System.out.println("____________________________");

        Payment mono = new Mono();
        mono.pay();
    }
}
