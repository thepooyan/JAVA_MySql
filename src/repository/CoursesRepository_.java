package repository;

import domainModel.Courses;
import domainModel.Entity;

public class CoursesRepository_ extends SuperRepository {

    public CoursesRepository_() {
        super("localhost:3306/dev", "root", "1234", "courses");
    }

    public int insert(Courses entity) {
        String[] schema = {"courseName", "score"};
        String[] values = {entity.getCourseName(), Integer.toString(entity.getScore())};
       return super.insertByValues(schema, values);
    }
}
