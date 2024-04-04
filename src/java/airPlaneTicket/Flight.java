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


   String Getdestination() {
        return destination;
   }
   String getFrom() {
        return from;
   }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getDate() {
        return date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
