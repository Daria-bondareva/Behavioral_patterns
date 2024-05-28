package Behavioral_patterns.ObserverFirstVersion;


public class Project {
    public static void main(String[] args) {
        KCDBookhouse kcdBookhouse = new KCDBookhouse();

        KCDSubscriber subscriber1 = new KCDSubscriber();
        KCDSubscriber subscriber2 = new KCDSubscriber();
        KCDSubscriber subscriber3 = new KCDSubscriber();

        kcdBookhouse.addSubscriber(subscriber1);
        kcdBookhouse.addSubscriber(subscriber2);
        kcdBookhouse.addSubscriber(subscriber3);

        kcdBookhouse.uploadNewBook("bdjvhd");
    }
}
