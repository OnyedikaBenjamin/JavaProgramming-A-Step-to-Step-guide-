package _9_ObjectsAndClasses;

public class Circle {

    private double radius;
    private double perimeter;
    private double area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

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

        System.out.printf("%.2f%n", circle1.getArea());
        System.out.printf("%.2f%n", circle2.getArea());

        System.out.printf("%.2f%n", circle1.getPerimeter());
        System.out.printf("%.2f%n", circle2.getPerimeter());

    }

}