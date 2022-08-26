package Others;

/**--- We can use static variables only when the value of the variable does not differ from instances of the class ---*/

public class Dogs {

    private static String name;

    public Dogs(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        Dogs bingo = new Dogs("Bingo");
        Dogs nosa = new Dogs("Nosa");

// This will print 'Nosa' twice because we changed the static variable value to Nosa when instantiating the nosa object.
        bingo.printName();
        nosa.printName();
    }
}

