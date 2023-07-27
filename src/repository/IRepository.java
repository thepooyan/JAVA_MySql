package repository;

import domainModel.Entity;

import java.sql.ResultSet;

public interface IRepository {
    public int insertByValues(String[] schema, String[] values);
    public int deleteById(Entity entity);
    public ResultSet selectAll();
}
