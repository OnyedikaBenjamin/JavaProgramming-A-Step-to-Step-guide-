package AnimalInheritance;

public class Cat extends Animal{
    int tail;

    public Cat(String name, int brain, int body, int size, int weight, int tail) {
        super(name, brain, body, size, weight);
        this.tail = tail;
    }


}
