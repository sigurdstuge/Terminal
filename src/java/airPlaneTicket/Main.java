package airPlaneTicket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Ole", "male", 140656, 35689754, "ole@ole.no", 565874  );


        Flight flight1 = new Flight("New york", "Oslo", 506, 270125 );
        Flight fligh2 = new Flight("Paris", "Oslo", 767, 280724);
        Flight fligh3 = new Flight("London", "Oslo",388, 311024);
        Flight flight4 = new Flight("Berlin", "Oslo", 436, 250824);

        Booking booking = new Booking();
        booking.bookingList.add(flight1);
        booking.bookingList.add(fligh2);
        booking.bookingList.add(fligh3);
        booking.bookingList.add(flight4);


        System.out.println(booking.searchCity("New york"));



        System.out.println(booking.bookingList.size());


        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        boolean isInMenu = true;
        boolean isInBag = false;

        while (isRunning) {
            if (isInMenu && !isInBag) {
                System.out.println("Custom service");
                System.out.println("1. Book flight");
                System.out.println("2. Your flight");
                System.out.println("3. Exit");
                int enterChoice = scanner.nextInt();
                switch (enterChoice) {
                    case 1:
                        isInBag = false;
                        isInMenu = false;
                        System.out.println("select destination");
                        Scanner scanner2 = new Scanner(System.in);
                        String customerChoice = scanner2.nextLine();
                        String result = booking.searchCity(customerChoice);
                        System.out.println(result);
                        break;
                    case 2:
                        isInMenu = false;
                        System.out.println("your flight");
                        break;
                    case 3:
                        isRunning = false;
                        System.out.println("back to front page");
                        break;

                    default:
                        System.out.println("valid option");
                }

            } else if (isInBag && !isInMenu) {
                System.out.println("select destination");
                System.out.println("2. exit");
                int enterChoice = scanner.nextInt();
                switch (enterChoice) {
                    case 1:

                        break;
                    case 2:
                        isRunning = false;
                        System.out.println("back to front page");
                        break;
                    default:
                        System.out.println("valid option");
                }

            }
            else if (isInBag && !isInMenu) {
                int useChoice = scanner.nextInt();
                switch (useChoice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                }
            } else {

            }
        } scanner.close();
    }
}
