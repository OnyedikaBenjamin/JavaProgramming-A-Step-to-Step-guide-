package Kunal.AbstractDemo;

import org.junit.jupiter.api.Ben_Billion_Explanation;

@Ben_Billion_Explanation("For an abstract class, there must be at least one abstract method.\n" +
        "           If we know that the functions in the parent class needs to be overridden, just make it abstract.\n" +
        "           We cannot create objects of an abstract class.\n" +
        "           Also, we cannot create an abstract constructor, being it methods or classes.\n" +
        "           No final value can be overridden."
        )

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
    abstract void career();
    abstract void partner();
}



