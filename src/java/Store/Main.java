package Store;

public class Main {

    public static void main(String[] args) {
        // Employee
        Employee owner = new Employee();
        //Store
        Store store = new Store(
                "Navn på butikken",
                owner
        );
        // CUSTOMER
        Customer customer = new Customer(1000);

        // Product

        //# 1) Create products available for purchase
        Product jeans =  new Product("jeans",600);

        //# 2) Add products to customer's shopping cart
        customer.addCart(jeans, 3);


        // CASH REGISTER
        //# 3) Process the buying of products via the cash register
        CashRegister register = new CashRegister(owner);
        register.processCustomer(customer);



        boolean success = store.getCashRegister().processCustomer(customer);

        //# 4) If the sale is successful,
        // make sure a receipt generated and added to the cash register

        // ---

        // Process two customers and afterward print out all receipts
        // and the total income earned

        for (Receipt receipt : store.getCashRegister().getReceipts()) {
            System.out.println(receipt);
        }

        System.out.println(store.getCashRegister().totalEarnings());

        // Extra:
        // 1) Create custom exceptions for certain situations,
        // for example: not enough money in customer wallet
        // 2) Make sure any values of money can not be negative
        // 3) Make use of:
        //      @Override
        //      public String toString() { ... } in all of the classes
    }
}
