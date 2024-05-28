package Behavioral_patterns.Strategy;

public class ClientAllergicNuts implements Client{
    @Override
    public boolean checkFood(String food) {
        if((food == "nuts")){
            System.out.println("I can`t eat nuts:'(");
            return false;
        }else {
            return true;
        }
    }
}
