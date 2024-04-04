package myStore;


import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(3000);
        Product jeans =  new Product("jeans",100);
        Product slacks = new Product("slacks", 100);
        Product shirt = new Product("shirt", 100);
        Product iphone = new Product("iphone", 14000);

        //Customer
        customer.addCart(jeans,2 );
        customer.addCart(slacks, 1);
        customer.addCart(shirt,1);
        customer.addMoney(500);
        System.out.println("-----");

        Scanner scanner = new Scanner(System.in);

        boolean isInMainMenu = true;
        boolean isInCart = false;

        boolean isInWallet = false;
        boolean isRunning = true;


        while (isRunning) {
            if (isInMainMenu && !isInCart) {
                System.out.println("shopping program: ");
                System.out.println("1. cart");
                System.out.println("2. wallet");
                System.out.println("3. exit");
                System.out.println("select option");
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        isInCart = true;
                        isInMainMenu = false;
                        System.out.println("navigating to cart...");

                        break;
                    case 2:
                        isInWallet = true;
                        isInMainMenu = false;
                        System.out.println("navigating to wallet...");
                        break;
                    case 3:
                        isRunning = false;
                        System.out.println("exiting...");
                        break;
                    default:
                        System.out.println("in valid option");
                }
            } else if(isInCart && !isInMainMenu) {
                System.out.println("cart");
                System.out.println("1. display cart");
                System.out.println("2. add item");
                System.out.println("3. remove item");
                System.out.println("4. check out");
                System.out.println("5. back");
                int useChoice = scanner.nextInt();
                switch (useChoice) {
                    case 1:
                        customer.viewCart();
                        break;
                    case 2:
                        System.out.println("Select product ID: ");
                        for ( Product product : Product.getProductList()) {
                            System.out.println("ID: " + product.getId() + ". " + product.getName());
                        }
                        int userChoice = scanner.nextInt();

                        Product selectedProduct = Product.findProductById(userChoice);

                        if(selectedProduct != null) {
                            System.out.println("SELECTTED ID: " + selectedProduct.getId() +"PRODUCT NAME: " + selectedProduct.getName());
                            System.out.println("enter quantety");
                            int enterChoice = scanner.nextInt();
                            if (enterChoice > 0) {
                                // gjøre logikken
                                customer.addCart(selectedProduct, enterChoice);
                            } else {
                                System.out.println("you choosed a negative number who not allowed1");
                            }
                            //TODO Problem 2. enterChoice overskriver Quantity i Cart
                        } else {
                             System.out.println("DISASTER!!!!!!!!!!!!!!!!");
                        }
                        break;
                    case 3:
                        // NEsten akkurat det samme for å fjerne
                        System.out.println("choose products to remove from cart");
                        int remove = scanner.nextInt();
                       // customer.removeProductFromCart(selectedProduct, 4);
                        break;

                    case 4:
                        // customer.checkout(customer);
                        break;

                    case 5:
                        isInCart = false;
                        isInMainMenu = true;
                        break;
                    default:
                        System.out.println("valid option");
                }
            } else if(isInWallet && !isInMainMenu) {
                // LEGG TIL WALLET MENY
                System.out.println("wallet");
                System.out.println("1. display money");
                System.out.println("2. add money");
                System.out.println("3. remove money");
                System.out.println("4. back");

                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        System.out.println("CUSTOMER: " + customer.getMoney());
                        break;
                    case 2:
                        int moneyAdding = scanner.nextInt();
                        customer.addMoney(moneyAdding);

                        break;
                    case 3:
                        System.out.println("You had to remove money");
                        int moneyRemove = scanner.nextInt();
                        customer.removeMoney(moneyRemove);
                        break;
                    case 4:
                    isInWallet = false;
                    isInMainMenu = true;
                        break;
                }

            }
        } scanner.close();
    }
}
