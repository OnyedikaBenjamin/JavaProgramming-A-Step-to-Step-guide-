//  Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated by
//   taking your weight in kilograms and dividing it by the square of your height in meters.
//______________________________________________________________________________________________________
//   BMI   <  18.5        (Underweight)
//    18.5  ≤  BMI < 25.0  (Normal)
//     25.0  ≤  BMI < 30.0  (Overweight)
//      30.0  ≤  BMI         (Obese)
//-------------------------------------------------------------------------------------------------------
//    Write a program that prompts the user to enter a weight in pounds and height in inches and
//     displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

package _10_ObjectOrientedThinking;
public class BmiNew {
    public static final double KilogramsPerPound = 0.45359237;
    public static final double metersPerInch = 0.0254;
    private String name;
    private int age;
    private double weight;
    private double height;

    public BmiNew(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BmiNew() {
        this("Aisha", 0, 0.00, 0.00);
    }

    public static void main(String[] args) {
        BmiNew test1 = new BmiNew();
        test1.setName("Timmy");
        test1.setAge(20);
        test1.setHeight(70);
        test1.setWeight(146);
        System.out.printf("%s%s%d%s%.2f%s%s",test1.getName(), "(", test1.getAge(),") Body Mass Index is ",test1.getBmi()," with status ",test1.getStatus());

    }

    private void validateName(String name) {
        if (name.isBlank() || name.isEmpty()) throw new IllegalArgumentException
                ("Name field cannot be left blank");
    }

    private void validateAge(int age) {
        if (age < 0) throw new IllegalArgumentException
                ("Age cannot be less than 0");
    }

    private void validateWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException
                ("Weight cannot be less than 0");
    }

    private void validateHeight(double height) {
        if (height < 0) throw new IllegalArgumentException
                ("Height cannot be less than 0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public double getWeight() {
        double weightInKg;
        weightInKg = weight * KilogramsPerPound;
        return weightInKg;
    }

    public void setWeight(double weight) {
        validateWeight(weight);
        this.weight = weight;
    }

    public double getHeight() {
        double heightInMeters;
        heightInMeters = height * metersPerInch;
        return heightInMeters;
    }

    public void setHeight(double height) {
        validateHeight(height);
        this.height = height;
    }

    public double getBmi() {
        double bmi;
        bmi = getWeight() / Math.pow(getHeight(), 2);
        return bmi;
    }

    public String getStatus(){
       if(getBmi() < 18.5)
           return "Underweight";
       else if (18.5 <= getBmi() || getBmi() < 25.0)
           return "Normal";
       else if (25.0 <= getBmi() || getBmi() < 30.0)
        return "OverWeight";
       else
        return "Obese";
    }
}
