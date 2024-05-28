package Behavioral_patterns.Mediator;

public class TravelAgent implements Mediator{
    private Client client;
    private TravelAgency travelAgency;
    private Airline airline;

    @Override
    public void notify(Partner partner, String event) {
        if(partner instanceof Client){
            System.out.println("Tourist requests: " + event);
            airline.get("Booking flight for " + event);
            travelAgency.get("Booking tours for " + event);
        }else if(partner instanceof TravelAgency){
            System.out.println("Tour Agency processes request: " + event);
        }else if(partner instanceof Airline){
            System.out.println("Airline processes request: " + event);
        }
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setTravelAgency(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
