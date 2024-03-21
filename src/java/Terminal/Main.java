package Terminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;
        boolean isRunning = true;

        while (isRunning) {
            if (!isLoggedIn) {
                System.out.println("mainMenu: ");
                System.out.println("1. log in");
                System.out.println("2. exit");
                System.out.println("select option");
                System.out.println();
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        isLoggedIn = true;
                        System.out.println("logging in...");
                        break;
                    case 2:
                        isRunning = false;
                        System.out.println("exiting...");
                    default:
                        System.out.println("in valid option");
                }
            } else {
                System.out.println("log in menu");
                System.out.println("1. option");
                System.out.println("2. option");
                System.out.println("3. option");
                System.out.println("4. option: log out");
                int useChoice = scanner.nextInt();
                switch (useChoice) {
                    case 4:
                        isLoggedIn = false;
                        System.out.println("welcome back :)");
                        System.out.println("you are logged out");
                        break;
                    default:
                        System.out.println("valid option");
                }
            }
        } scanner.close();
    }
}
