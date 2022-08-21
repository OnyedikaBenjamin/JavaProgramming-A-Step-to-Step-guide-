package _9_ObjectsAndClasses;

public class Circle {
    private final double radius;

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
   }
   public Circle(double radius){
        this.radius = radius;
   }
   public static void main(String[] args) {

       Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(6);

        System.out.printf("%s%.2f%n","The area of circle 1 is ",  circle1.getArea());
        System.out.printf("%s%.2f%n","The area of circle 2 is ", circle2.getArea());

        System.out.printf("%s%.2f%n","The perimeter of circle 1 is ", circle1.getPerimeter());
        System.out.printf("%s%.2f%n", "The area of circle 2 is ", circle2.getPerimeter());

    }

}