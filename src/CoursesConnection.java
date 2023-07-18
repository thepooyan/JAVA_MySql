import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CoursesConnection {
    Connection cnn;
    public CoursesConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "1234");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(String courseName, int score) {
        try {
            PreparedStatement statement = this.cnn.prepareStatement("insert into courses (courseName, score) values (?, ?)");
            statement.setString(1, courseName);
            statement.setInt(2, score);

            statement.executeUpdate();
            statement.close();
            cnn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
