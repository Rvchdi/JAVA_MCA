package dao;

import models.Client;
import models.Driver;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface DriverDao {
    Connection cnx = ConnectionDB.getConnection();
    public default void add(Driver driver) {
        try {
            PreparedStatement ps;
            String strQuery = "INSERT INTO driver(name, CIN,salary,address,availability) VALUES (?,?,?,?,?)";
            ps = cnx.prepareStatement(strQuery);
            ps.setString(1, driver.getName());
            ps.setString(2, driver.getCIN());
            ps.setString(3, Integer.toString(driver.getSalary()));
            ps.setString(4, driver.getAddress());
            ps.setInt(5, driver.isAvailability());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    List<Driver> getAll();
}
