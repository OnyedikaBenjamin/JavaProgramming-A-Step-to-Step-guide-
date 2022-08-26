package Animal;

public class Animal {
    private String name;    // Here we provided the attributes that all animals have
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
//------------------ Here we created a method that is spectacular to all animals. --------------------------------------
    public void eat() {        //  All Animals eat
        System.out.println("Animal is eating");
    }
    public static void move() {     // All animals move...  you cannot override a Static of Final method like this one.
        System.out.println("Animal is moving");
    }


//------------------ Here we provided a setter and getter for each of the data fields ----------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



}
