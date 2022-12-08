package _10_ObjectOrientedThinking;

public class TheStringClass {
    //  charAt index
    //  length()
    //  subString
    //  indexOf
    //  lastIndexOf
    public static void main(String[] args) {
        String element = "Bananas";

        System.out.println(element.charAt(4));
        System.out.println(element.length());
        System.out.println(element.substring(2));  // This will return all the elements from index 2
        System.out.println(element.substring(1, 4));          // This will return all the element from index1 to index3
        System.out.println(element.indexOf("a"));
        System.out.println(element.indexOf('s'));
        System.out.println(element.lastIndexOf('n'));
        System.out.println(element.lastIndexOf("a"));
    }
}

