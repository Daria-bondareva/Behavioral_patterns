package Behavioral_patterns.Strategy;

public class Context {
    String food;
    Client client;

    public Context(String food, Client client) {
        this.food = food;
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getFood() {
        return food;
    }

    public boolean getResult(){
        return client.checkFood(food);
    }
}
