package _3_Selections.Vehicle;

public class Toyota extends Car {

    private int warrantyInMonths;

    public Toyota(int warrantyInMonths) {
        super("Toyota", "Small jeep size", 4, 4, 6, false, 0);
        this.warrantyInMonths = warrantyInMonths;
    }
}