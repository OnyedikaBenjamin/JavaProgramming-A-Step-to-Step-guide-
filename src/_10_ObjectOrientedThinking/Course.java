package _10_ObjectOrientedThinking;

public class Course{
    private String courseName;
    private String [] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName(){
        return courseName;
    }

}