import domainModel.Courses;
import repository.CoursesRepository;
import repository.Transactional;

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
//        Courses a = Courses.builder().id(6).courseName("ali").score(100).build();
//
//        CoursesRepository cr = new CoursesRepository();
//        cr.insert(a);
        Transactional a = new Transactional();
        int res = a.Insert();
        System.out.println(res);
    }
}
