package Store;

import java.util.HashMap;

public class Receipt {

    //# Fields

    Product Product;
    private final HashMap<Product, Integer> products;


    //# Constructors
    public Receipt(Product product) {
        this.products = new HashMap<>();
        this.products.put(product, 1);
    }


    Receipt() {
        this.products = new HashMap<>();
    }


    //# Getter-methods
    HashMap<Product, Integer> getProducts() {
        return this.products;
    }


    //# Methods
    int totalPrice() {




        return 0;
        // TODO
    }

    int totalProducts() {


        return 0; // TODO
    }
}
