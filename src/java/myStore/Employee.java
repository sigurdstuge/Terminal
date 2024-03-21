package myStore;

public class Employee {
    //# Static-fields
    private static int counter = 0;


    //# Fields
    private final int identifier;


    //# Constructors
    Employee() {
        this.identifier = Store.Employee.counter ++;
    }


    //# Getter-methods
    int getEmployeeNumber() {
        return this.identifier;
    }

    public void setEmployeeNumber() {

    }

}
