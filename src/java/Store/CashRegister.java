package Store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CashRegister {

    //# Fields
    private int money;
    private Employee employee;
    private ArrayList<Receipt> receipts;


    //# Constructor
    CashRegister(Employee employee) {
        this.money = 0;
        this.employee = employee;
        this.receipts = new ArrayList<>();
    }


    //# Getter-methods
    int getMoney() {
        return this.money;
    }

    Employee getEmployee() {
        return this.employee;
    }

    int getEmployeeNumber() {
        return this.getEmployee().getEmployeeNumber();
    }

    ArrayList<Receipt> getReceipts() {
        return this.receipts;
    }


    //# Methods
    boolean processCustomer(Customer customer) {
                System.out.println("HELLO WORLD");
        //# 1) Get total price of all products in cart
        int totalamount = 0;
        for (Map.Entry<Product, Integer> entry: customer.getShoppingCart().entrySet()) {
            totalamount += entry.getKey().getPrice() * entry.getValue();
        }

        if( customer.getMoney() >= totalamount  ){
                customer.getWallet().removeMoney(totalamount);
                this.money += totalamount;
            // oppdater pengene
            // Tømme shoppingcart
            // ++++ Receipt
            return true;
        } else {
            return false;
        }

        //# 2) Check if customer has enough money in wallet

        //# 3) If customer has enough money:
        //# 3.1) Remove money from wallet
        //# 3.2) Add money to cash register
        //# 3.3) Clear products from customer cart

        //# 4) Create a receipt

        //# 5) Print the receipt to the terminal
        //# 6) return true

        //# 3) else:

    }

    int totalEarnings() {
        // TODO go through each receipt and sum up all income and return result
        return 0;
    }
}
