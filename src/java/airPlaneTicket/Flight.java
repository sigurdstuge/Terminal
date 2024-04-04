package airPlaneTicket;

public class Flight {
    String destination;
    String from;
    int flightNumber;
    int date;

    Flight(String destination, String from, int flightNumber, int date) {
        this.destination = destination;
        this.from = from;
        this.flightNumber = flightNumber;
        this.date = date;
    }
}
