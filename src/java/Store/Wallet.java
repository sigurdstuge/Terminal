package Store;

public class Wallet {

    public static Object removeMoney;
    //# Fields
    private Customer owner;
    private int money;


    //# Constructor
    Wallet(Customer owner, int money) {
        this.owner = owner;
        this.money = money;
    }


    //# Getter-methods
    Customer getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }


    //# Setter-methods
    void setMoney(int value) {
        this.money = value;
    }

    void addMoney(int value) {
        this.setMoney(this.getMoney() + value);
    }

    void removeMoney(int value) {
        if (this.getMoney() >= value) {
            this.setMoney(this.getMoney() - value);
        }
    }
}
