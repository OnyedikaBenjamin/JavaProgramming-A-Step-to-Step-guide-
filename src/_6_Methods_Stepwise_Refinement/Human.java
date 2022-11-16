package _6_Methods_Stepwise_Refinement;

public class Human {
    static long population;  // This explains the usage of the static keyword. It allows us to reach out to the
                            // Instance variables using the class-name. operator without creating an object of the same class.
    int age, salary;
    String name;
    boolean married;
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;    // Whenever a human object is being created, the population should increase by one.
    }
    public static void main(String[] args) {
        Human Benjamin = new Human(22, "Benjamin", 50000, false);
        Human Billion = new Human(30, "Ben-Billion the Billionaire", 100000000, true);


        // So below, when you call Human.population, it shows how many Human objects exists.
        System.out.println(Human.population);
    }
}
