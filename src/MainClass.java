import java.util.Scanner;

public class MainClass {
    /**
     * how to use another jar file as lib in project
     * 1. create lib folder and paste all jar files
     * Project structure > libraries > add the lib folder
     * done!
     *  @param args
     */
    public static void main(String[] args) {
        CoursesConnection coursesConnection = new CoursesConnection();
        MyScanner scn = new MyScanner();

        String courseName = scn.scanString("Enter name: ");
        int courseScore = scn.scanInt("Enter score: ");

        coursesConnection.insert(courseName, courseScore);
        System.out.println("new record added successfully!");
    }
}
