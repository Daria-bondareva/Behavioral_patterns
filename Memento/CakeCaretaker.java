package Behavioral_patterns.Memento;

public class CakeCaretaker {
    Object objMemento;

    public void saveState(Cake cake) {
        objMemento = cake.save();
    }
    public void restoreState(Cake cake){
        cake.restore(objMemento);
    }
}
