package Behavioral_patterns.Memento;

public class MementoProject {
    public static void main(String[] args) {
        CakeCaretaker cakeCaretaker = new CakeCaretaker();

        Cake cake = new Cake("Elena", "strawberry","butter", "chocolate", 500);
        System.out.println(cake);

        cake.setCakeConsistAndWeight("raspberry","pistachio","sponge cake",1000);
        System.out.println(cake);

        System.out.println("Saving state.");
        cakeCaretaker.saveState(cake);

        cake.setCakeConsistAndWeight("raspberry","chocolate","sponge cake",2000);
        System.out.println(cake);

        System.out.println("Restoring saved state.");
        cakeCaretaker.restoreState(cake);
        System.out.println(cake);
    }
}
