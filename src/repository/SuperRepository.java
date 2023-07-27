package repository;

import domainModel.Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SuperRepository implements IRepository{

    Connection cnn;
    String table;
    public SuperRepository(String repositoryAddress, String user, String pass, String table) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://" + repositoryAddress, user, pass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.table = table;
    }

    @Override
    public int insert() {
        return 0;
    }

    @Override
    public int deleteById(Entity entity) {
        try {
//            System.out.println("deleting" + entity.toString());
           PreparedStatement statement = cnn.prepareStatement("delete from " + this.table + " where id = ?");
           statement.setInt(1, entity.getId());

           return statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public ResultSet selectAll() {
        try {
            PreparedStatement statement = cnn.prepareStatement("select * from ?");
            statement.setString(1, this.table);
            return statement.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
