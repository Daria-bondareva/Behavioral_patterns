package Behavioral_patterns.Mediator;

public class Project {
    public static void main(String[] args){
        TravelAgent travelAgent = new TravelAgent();

        Client client = new Client(travelAgent);
        TravelAgency travelAgency = new TravelAgency(travelAgent);
        Airline airline = new Airline(travelAgent);

        travelAgent.setClient(client);
        travelAgent.setTravelAgency(travelAgency);
        travelAgent.setAirline(airline);

        client.send("trip to Turkey");
    }
}
