package airPlaneTicket;

import java.util.ArrayList;

public class Booking {
   ArrayList<Flight> bookingList = new ArrayList<>();



  public String searchCity(String destination) {
     for (Flight flight : bookingList) {
         if (flight.destination.equalsIgnoreCase(destination));
         return flight.Getdestination() + flight.getFlightNumber() + flight.getFrom();


     }
      return null;
  }


}
