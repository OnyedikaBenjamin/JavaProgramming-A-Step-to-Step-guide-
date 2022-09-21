package _10_ObjectOrientedThinking;

public class Course{
    private String courseName;
    private String[] students = new String[100];
    private int noOfStudents;

    public Course(String courseName){
        this.courseName = "CourseName";
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

}