package myStore;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private final String name;
    private final int price;
    private static int counter = 0;
    private final int productId;

    static List<Product> productList = new ArrayList<>();

    //# Constructors
    Product(String name, int price) {
        this.productId = Product.counter ++;
        this.name = name;
        this.price = price;
        productList.add(this);
    }



    //# Getter-methods
    String getName() {
        return this.name;
    }

    int getId() {
        return this.productId;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    int getPrice() {
        return this.price;
    }

    public static Product findProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
