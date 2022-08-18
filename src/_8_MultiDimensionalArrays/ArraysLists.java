package _8_MultiDimensionalArrays;

import java.util.ArrayList;

public class ArraysLists {

    public static void main(String[] args) {

             ArrayList<String> items = new ArrayList<>();    // This is how to initialize an ArrayList

/**  Note that 'ArrayList' is a keyword and Item list is the name of my item variable.   */

// Here we added items to the array list

        items.add("Noodles");
        items.add("Rice");
        items.add("Tomatoes");

        for (int i = 0; i < items.size(); i++) {    // We then displayed the array using a for loop
            System.out.println(items.get(i));
        }
/** Note Unlike Single and two-dimensional arrays, we use .size() and not .length
 *  Also, we used 'items.get(i)'   instead of    'items[i]'.
 *  If we use 'items[i],  it will display in this format [Noodles, Rice, Tomatoes].*/

    // We can actually add different arrayList to a single array list

        ArrayList <String> tools = new ArrayList<>();

        tools.add("Hammer");
        tools.add("Wedge");
        tools.add("Chisel");

        ArrayList <String> embrodries = new ArrayList<>();

        embrodries.add("Necklaces");
        embrodries.add("Wrist Watches");
        embrodries.add("Wrist bands");

        // An arrayList that entails other arrayList can be initialized using this format.

        ArrayList<ArrayList<String>> shoppingList  = new ArrayList<>();

        shoppingList.add(tools);
        shoppingList.add(embrodries);
        shoppingList.add(items);

        // Here we use a for each loop to print the values of our array List.

        for(int i =0; i < shoppingList.size(); i++){
            System.out.println(shoppingList.get(i));
        }


    }
}
