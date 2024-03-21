package myStore;

public class Wallet {

    private Customer owner;
    private int money;

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
        };
    }
}
