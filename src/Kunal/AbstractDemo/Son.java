package Kunal.AbstractDemo;

public class Son extends Parent {
    int age;

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Billionaire");
    }

    @Override
    void partner() {
        System.out.println("I love my wife ");
    }
}
