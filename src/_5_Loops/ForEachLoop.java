/** Our for each loop is also known as enhanced for loop */

package _5_Loops;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] animalsList = {"Goat", "Monkey", "Dog", "Bird"};

        for (String e : animalsList) {   // for each element (e) in my animalsLIst,
            System.out.println(e);      //  print out the elements (e).
        }
    }

    /** Note : The data type of elements e must be the same as the data type of the animalsList. */
}
