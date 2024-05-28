package Behavioral_patterns.Strategy;

public class NormalClient implements Client{

    @Override
    public boolean checkFood(String food) {
        if((food == "spicy")){
            System.out.println("I just don`t like spicy");
            return false;
        }else {
            return true;
        }
    }


}
