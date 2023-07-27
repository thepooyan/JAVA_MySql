package repository;

import domainModel.Courses;
import domainModel.Entity;

public class CoursesRepository_ extends SuperRepository{

    public CoursesRepository_() {
        super("localhost:3306/dev", "root", "1234", "courses");
    }

//    @Override
//    public int insert(Courses courses) {
//
//        String[] schema = {"courseName", "score"};
//        String[] values = {courses.getCourseName(), courses.getScore()};
//        return super.insertByValues();
//    }
}
