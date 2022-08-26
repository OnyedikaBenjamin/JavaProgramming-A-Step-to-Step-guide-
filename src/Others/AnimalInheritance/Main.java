package Animal;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bingo", 23, 56, 2, 4, 1, 20, "Silk coat");

//  An advantage of inheritance is that we can use a subclass object to call an attribute or method of the Parent class.
        dog1.eat();
    }
}