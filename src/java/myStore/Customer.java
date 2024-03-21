package myStore;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private Wallet wallet;


    HashMap<Product, Integer> cart;

    Customer(int money) {
        this.wallet = new Wallet(this, money);
        this.cart = new HashMap<>();
    }

    Wallet getWallet() {
        return this.wallet;
    }

    int getMoney() {
        return this.wallet.getMoney();
    }

    public void addCart(Product product, Integer quantety) {
        cart.put(product, quantety);
    }

    public void clearCart() {
        cart.clear();
    }

    public void viewCart() {
        for (Product i : cart.keySet()) {
            System.out.println("Product: "  + i.getName() + "," + " Quantety: " + cart.get(i));
        }
    }


    public void removeProductFromCart(Product product, int quantityToRemove) {
        if (cart.containsKey(product)) {
            int currentQuantity = cart.get(product); //TODO THIS !!!!
            if(currentQuantity > quantityToRemove) {
                cart.put(product, currentQuantity - quantityToRemove);
            }
        } else {
            cart.remove(product);
        }
    }
    public void removeMoney(int moneyToRemove) {
        int updatedMoney;
        updatedMoney = wallet.getMoney() - moneyToRemove;
        wallet.setMoney(updatedMoney);
        System.out.println("Updated money: "+ updatedMoney);
    }

    public void addMoney(int moneyAdd) {
        int moneyUpdated;
        moneyUpdated = wallet.getMoney() + moneyAdd;
        wallet.setMoney(moneyUpdated);
        System.out.println("Updated money: " + moneyUpdated);
    }


    public void checkout(Customer customer) {
        int costSum = 0;

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            costSum += entry.getKey().getPrice() * entry.getValue();
        }

        if (customer.getMoney() >= costSum) {
            System.out.println("process sucsessfully");
            clearCart();
            customer.removeMoney(costSum);
            System.out.println("current money" + customer.getMoney());
        } else {
            System.out.println("something wrong");
        }
        System.out.println("cost" + costSum);

    }
  // receipt metode
    // printe ut

    public void receipt() {

        double totalCost = 0;

        System.out.println("Your receipt");

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            Product product = entry.getKey();
            int quantety = entry.getValue();
            double cost = product.getPrice() * quantety;

            totalCost += cost;

            System.out.println("Purchased: " + product.getName() + " " + "Price: " + product.getPrice() + " " + "Quantity: " + quantety);
        }

        System.out.println("totalCost: $ " + totalCost);
    }
}

