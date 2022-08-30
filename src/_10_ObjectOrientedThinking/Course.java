package _10_ObjectOrientedThinking;

public class Course {
    private String courseName;
    private String [] students = new String[100]; // An array that can hold 100 Students name.
    private int noOfStudents;

   public Course(String courseName){
       this.courseName = courseName;
   }
   public void addStudent(String student){
       students[noOfStudents] = student;
       noOfStudents++;
   }
   public void dropStudent(){
   }
   public String getCourseName(){
       return courseName;
   }
   public int getNoOfStudents(){
       return noOfStudents;
   }
   public String[] getStudents(){
       return students;
   }





}
