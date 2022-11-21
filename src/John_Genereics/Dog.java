package John_Genereics;

// To show that a Dog is a sub (child) class of the base (Parent) class Animal, we use the keyword extends.
public class Dog  extends Animal {

    // A dog can have some attributes that are not spectacular to all animals....
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // A dog have 1 brain and 1 body, so we set its default values to 1
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing a bone");
    }

    @Override                 // When we Override, we provide another implementation different from the super class.
    public void eat() {
        chew();
        System.out.println("Dog.eat called");
        super.eat();       // We can also call a method from the super class inside a subclass method using the keyword 'super'
    }
}
