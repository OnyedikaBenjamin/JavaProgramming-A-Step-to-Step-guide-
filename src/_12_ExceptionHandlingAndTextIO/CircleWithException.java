package _12_ExceptionHandlingAndTextIO;

    public class CircleWithException {
        /**    The number of the objects created    */
        private static int numberOfObjects = 0;
        /**  The radius of the circle    */
        private double radius;

        /**  Construct a circle with radius 1  */
        public CircleWithException() {
            this(1.0);
        }

        /**  Construct a circle with a specified radius    */
        public CircleWithException(double newRadius) {
            setRadius(newRadius);
            numberOfObjects++;
        }

        /**    Return numberOfObjects    */
        public static int getNumberOfObjects() {
            return numberOfObjects;
        }

        public static void main(String[] args) {
             try {
                 CircleWithException c1 = new CircleWithException(5);
                 CircleWithException c2 = new CircleWithException(-5);
                 CircleWithException c3 = new CircleWithException(0);
                 }
             catch (IllegalArgumentException ex) {
                 System.out.println(ex);
                 }

             System.out.println("Number of objects created: " +
                     CircleWithException.getNumberOfObjects());
             }

        /**    Return radius    */
        public double getRadius() {
            return radius;
        }

        /**    Set a new radius    */
        public void setRadius(double newRadius)
                throws IllegalArgumentException {
            if (newRadius >= 0)
                radius = newRadius;
            else
                throw new IllegalArgumentException(
                        "Radius cannot be negative");
        }

        /**    Return the area of this circle    */
        public double findArea() {
            return radius * radius * 3.14159;
        }
}