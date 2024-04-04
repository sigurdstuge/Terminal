package airPlaneTicket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Ole", "male", 140656, 35689754, "ole@ole.no", 565874  );


        Flight flight = new Flight("New york", "Oslo", 506, 270122 );


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
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                }

            }
        }
    }
}
