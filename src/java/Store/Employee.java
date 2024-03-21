package Store;

public class Employee {

    //# Static-fields
    public static int counter = 0;


    //# Fields
    private final int identifier;


    //# Constructors
    Employee() {
        this.identifier = Employee.counter ++;
    }


    //# Getter-methods
    int getEmployeeNumber() {
        return this.identifier;
    }
}
