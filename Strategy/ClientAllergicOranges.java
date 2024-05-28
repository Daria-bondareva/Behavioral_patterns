package Behavioral_patterns.Strategy;

public class ClientAllergicOranges implements Client{
    @Override
    public boolean checkFood(String food) {
        if((food == "oranges")){
            System.out.println("I have allergy:(");
            return false;
        }else {
            return true;
        }
    }
}
