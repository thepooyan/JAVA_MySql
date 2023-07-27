package repository;

import domainModel.Entity;

import java.sql.ResultSet;

public interface IRepository {
    public int insert();
    public int deleteById(Entity entity);
    public int update();
    public ResultSet selectAll();
}
