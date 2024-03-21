package Store;

import java.util.HashMap;

public class Customer {

    //# Fields
    private Wallet wallet;
    private HashMap<Product, Integer> cart;


    //# Constructors
    Customer(int money) {
        this.wallet = new Wallet(this, money);
        this.cart = new HashMap<>();
    }


    //# Getter-methods
    Wallet getWallet() {
        return this.wallet;
    }

    int getMoney() {
        return this.wallet.getMoney();
    }

    HashMap<Product, Integer> getShoppingCart() {
        return this.cart;
    }


    //# Setter-methods


    public void addCart(Product product, Integer quantety) {
        cart.put(product,quantety);

    }

    //# Methods
    void removeMoney() {
        // TODO
    }
}
