package _9_ObjectsAndClasses;

/** Write a program that creates 10 circles, it then initializes circle radii with random values and
    displays the radius and area per circle, and the sum of the areas of the circle */

public class CircleClass {

     double radius = 10 + (Math.random() * 50);   // My radius can be from 10 to 50.
     double area = Math.PI * radius * radius;
    public static CircleClass[] createTenCircles() {
        CircleClass[] circles = new CircleClass[10]; // Here we created an array of reference type CircleClass.
        for (int i = 0; i < circles.length; i++) {
            CircleClass circleObject = new CircleClass();  // Here we created 10 objects.
            circles[i] = circleObject;
        }
        return circles;
    }

    public double getArea() {
        return area;
    }

    public static void displayIt(){
        for(int j =0; j < createTenCircles().length; j++){
            System.out.println(createTenCircles());
        }
    }

}
