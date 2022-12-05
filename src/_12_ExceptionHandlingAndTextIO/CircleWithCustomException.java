package _12_ExceptionHandlingAndTextIO;

class CircleWithCustomException {
    private static int objects = 0;
    private double radius;

    public CircleWithCustomException() throws InvalidRadiusException {
         this(1.0);
    }

    public CircleWithCustomException(double newRadius)throws InvalidRadiusException{
        setRadius(newRadius);
        objects++;
    }

    public static void main(String[] args){

        try {
         CircleWithCustomException circle1 = new CircleWithCustomException(-5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(-5);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }
        System.out.println("There are " + objects + " objects created.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius)throws InvalidRadiusException {
        if(radius >=  0){
           radius = newRadius;
        }
        else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public int showNumberOfObjects(){
        return objects;
    }

    public double showArea(){
        return getRadius() * getRadius() * 3.14;
    }
}