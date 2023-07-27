import domainModel.Courses;
import repository.CoursesRepository_;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class MainClass {
    /**
     * how to use another jar file as lib in project
     * 1. create lib folder and paste all jar files
     * Project structure > libraries > add the lib folder
     * done!
     *  @param args
     */
    public static void main(String[] args) {
//        Courses a = Courses.builder().id(6).courseName("ali").score(100).build();
//
//        CoursesRepository cr = new CoursesRepository();
//        cr.insert(a);
//        cr.printAllCourses();

//        Transactional a = new Transactional();
//        int res = a.Insert();
//        System.out.println(res);
        CoursesRepository_ course = new CoursesRepository_();
        String[] a = {"a", "b", "c"};
        String[] b = {"1", "2", "3"};
        course.insertByValues(a,b);
//        Courses newCourse = Courses.builder().courseName("Entity").score(20).build();
//        Courses newCourse2 = Courses.builder().id(7).build();
//
//        ResultSet res = course.selectAll();
//            try {
//                while (res.next()) {
//                    System.out.println(res.getInt("id"));
//                    System.out.println(res.getString("CourseName"));
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }


    }
}
