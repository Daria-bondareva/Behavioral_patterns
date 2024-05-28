package Behavioral_patterns.Memento;

public class Cake {
    String nameConfectioner;
    String filling;
    String cream;
    String cake;
    double cakeWeight;

    public Cake(String name, String filling, String cream, String cake, double cakeWeight) {
        this.nameConfectioner = name;
        this.filling = filling;
        this.cream = cream;
        this.cake = cake;
        this.cakeWeight = cakeWeight;
    }


    public String toString() {
        return "Cake{" +
                "name='" + nameConfectioner + '\'' +
                ", filling='" + filling + '\'' +
                ", cream='" + cream + '\'' +
                ", cake='" + cake + '\'' +
                ", timeBaking=" + cakeWeight +
                '}';
    }

    public void setCakeConsistAndWeight(String filling, String cream, String cake, double cakeWeight){
        this.filling = filling;
        this.cream = cream;
        this.cake = cake;
        this.cakeWeight = cakeWeight;
    }

    public Memento save(){
        return new Memento(nameConfectioner,filling, cream, cake, cakeWeight);
    }

    public  void restore(Object objMemento){
        Memento memento = (Memento) objMemento;
        nameConfectioner = memento.mementoNameConfectioner;
        filling = memento.mementoFilling;
        cream = memento.mementoCream;
        cake = memento.mementoCake;
        cakeWeight = memento.mementoCakeWeight;
    }
    private class Memento{
        String mementoNameConfectioner;
        String mementoFilling;
        String mementoCream;
        String mementoCake;
        double mementoCakeWeight;

        public Memento(String mementoNameConfectioner, String mementoFilling, String mementoCream, String mementoCake, double mementoCakeWeight) {
            this.mementoNameConfectioner = mementoNameConfectioner;
            this.mementoFilling = mementoFilling;
            this.mementoCream = mementoCream;
            this.mementoCake = mementoCake;
            this.mementoCakeWeight = mementoCakeWeight;
        }
    }
}
