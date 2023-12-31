package repository;

import domainModel.Courses;

import java.sql.*;

public class CoursesRepository {
    Connection cnn;
    public CoursesRepository() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "1234");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int insert(Courses course) {
        try {
            PreparedStatement statement = this.cnn.prepareStatement("insert into courses (courseName, score) values (?, ?)");
            statement.setString(1, course.getCourseName());
            statement.setInt(2, course.getScore());

            int affectedRows = statement.executeUpdate();
            statement.close();

            return affectedRows;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public boolean deleteById(Courses course) {
        try {
           PreparedStatement statement = cnn.prepareStatement("delete from courses where id = ?");
           statement.setInt(1, course.getId());
           statement.executeUpdate();
           statement.close();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    public void closeConnection() {
        try {
            this.cnn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public ResultSet getAllCourses() {
        try {
            PreparedStatement statement = cnn.prepareStatement("select * from courses");
            return statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void printAllCourses() {
        ResultSet result = getAllCourses();
        try {
            while (result.next()) {
                System.out.println(result.getString("id"));
                System.out.println(result.getString("courseName"));
                System.out.println(result.getString("score"));
                System.out.println("___________________");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
