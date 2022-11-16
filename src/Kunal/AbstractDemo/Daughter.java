package Kunal.AbstractDemo;

public class Daughter extends Parent {
    int age;

    public Daughter(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a nurse");
    }

    @Override
    void partner() {
        System.out.println("I love my husband");
    }
}
