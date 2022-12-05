package _12_ExceptionHandlingAndTextIO;

public class InvalidRadiusException extends Exception{
    private double radius;
    public InvalidRadiusException(double radius){
        super("Invalid radius : " + radius); // This invokes the superclass’s constructor with a message. This message will be set in the exception object and can be obtained by invoking getMessage() on the object.
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}