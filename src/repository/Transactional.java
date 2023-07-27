package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactional {
    Connection cnn;
    public Transactional() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "1234");
            this.cnn.setAutoCommit(false);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int Insert() {
        PreparedStatement statement = null;
        try {
            int result = 0;
            statement = cnn.prepareStatement("insert into courses (courseName, score) values ('new', '123')");
             result += statement.executeUpdate();

            statement = cnn.prepareStatement("insert into courses (courseName, score) values ('new2', 'aa')");
            result += statement.executeUpdate();

            cnn.commit();

            return result;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                cnn.rollback();
                System.out.println("initiating rollback");
            } catch (SQLException ex) {
                System.out.println("rollback failed");
                System.out.println(e.getMessage());
            }
            return 0;
        }
    }
}
