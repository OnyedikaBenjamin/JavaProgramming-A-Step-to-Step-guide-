package _8_MultiDimensionalArrays;

import java.util.ArrayList;

public class ArraysLists {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();    // This is how to initialize an ArrayList

          // Here we added items to the array list
        items.add("Noodles");
        items.add("Rice");
        items.add("Tomatoes");

        // We then displayed the array using a for loop
        for (String item : items) {
            System.out.println(item);
        }

        // We can actually add different arrayList to a single array list
        ArrayList <String> tools = new ArrayList<>();
        tools.add("Hammer");
        tools.add("Wedge");
        tools.add("Chisel");

        ArrayList <String> embroiders = new ArrayList<>();
        embroiders.add("Necklaces");
        embroiders.add("Wrist Watches");
        embroiders.add("Wrist bands");

        // An arrayList that entails other arrayList can be initialized using this format.
        ArrayList<ArrayList<String>> shoppingList  = new ArrayList<>();
        shoppingList.add(tools);
        shoppingList.add(embroiders);
        shoppingList.add(items);

        shoppingList.remove(1);

        // Here we use a for each loop to print the values of our array List.
        for (ArrayList<String> strings : shoppingList) {
            System.out.println(strings);
        }

    }
}
