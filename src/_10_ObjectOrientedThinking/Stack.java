package _10_ObjectOrientedThinking;
// Stack uses the last in first out principle
// We can use stack to undo and redo (i.e Web browser moving back and front)

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> gameStack = new java.util.Stack<String>();

        //Check if our stack is empty
        System.out.println(gameStack.empty());

        // the .push method is used to add element to the top of the stack
        gameStack.push("Minecraft");
        gameStack.push("Pes");
        gameStack.push("DOOM");
        gameStack.push("Borderlands");
        gameStack.push("Fast And Furious");

        // Now that we have added items to the game stack, let's checkAndPrint if the stack is empty again
        System.out.println("Is the game stack empty? -> " + gameStack.empty());

        // let's print our stack
        System.out.println("");
        for (int i = 0; i < gameStack.size(); i++) {
            System.out.println(gameStack.get(i));
        }

        // the .pop method is used to remove elements from the stack top
        gameStack.pop();
        gameStack.pop();

        // let's print our game stack again having removed the last two items of the stack
        System.out.println("");
        for (int i = 0; i < gameStack.size(); i++) {
            System.out.println(gameStack.get(i));
        }

        // we added the elements back
        gameStack.push("Borderlands");
        gameStack.push("Fast And Furious");

        // we can assign the values we pop to a variable
        String myFavouriteGame = gameStack.pop();
        System.out.println("My favourite game is the last element in my stack which is " + myFavouriteGame);

        // I added back my popped element
        gameStack.push("Fast and Furious");
        System.out.println("");

         // if we use the pop function, it can assign it to the variable and still remove it from the stack
        //  we can view it using the .peek function

        System.out.println("The element on top of the stack is " + gameStack.peek());
        System.out.println("");

        // Then we print it again to show that the element is untouched
        for (int i = 0; i < gameStack.size(); i++) {
            System.out.println(gameStack.get(i));
        }

         // if we intend to search for an element in the stack we use the .search function
        //  if it exists, it will return the index of the element we searched for else, it returns -1
        System.out.println(gameStack.search("Minecraft"));
        System.out.println(gameStack.search("Arcade"));

    }
}
