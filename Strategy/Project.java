package Behavioral_patterns.Strategy;

public class Project {
    public static void main(String[] args) {
        String food = "nuts";

        Client clientNormal = new NormalClient();
        Context context = new Context(food, clientNormal);

        System.out.println("Do you like this? It`s " + context.getFood() + "! - " + context.getResult());

        Client allergicNuts = new ClientAllergicNuts();
        context.setClient(allergicNuts);

        System.out.println("Do you like this? It`s " + context.getFood() + "! - "  + context.getResult());

    }
}
