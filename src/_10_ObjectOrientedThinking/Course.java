package _10_ObjectOrientedThinking;

public class Course{
    private String courseName;
    private String[] students = new String[100];
    private int noOfStudents;

    public Course(String courseName){
        this.courseName = "CourseName";
    }

    public static void main(String[] args) {
        Course course1 = new Course("Data Base Management");
        Course course2 = new Course("System Analysis and design");

        course1.addStudents("Benjamin");
        course1.addStudents("Billion");
        for (int i =0; i < course1.getNoOfStudents(); i++) {
            System.out.println(course1.students[i]);
        }
        System.out.println("Number of students in course1 is " + course1.getNoOfStudents());


    }

    public void addStudents(String student){
       students[noOfStudents] = student;
       noOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNoOfStudents(){
        return noOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(){}

}