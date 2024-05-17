package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectionDB;
import models.Driver;

public class DriverDaoImp implements DriverDao{

    Connection cnx ;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Driver> getAll() {
        cnx = ConnectionDB.getConnection();
        DriverDaoImp Driver = new DriverDaoImp();
        List<Driver> drivers = new ArrayList<>();
        String strQuery = "SELECT * FROM driver";
        try {
            ps = cnx.prepareStatement(strQuery);
            rs = ps.executeQuery();

            while (rs.next()) {
                Driver d = new Driver();
                d.setName(rs.getString(2));
                d.setCIN(rs.getString(3));
                d.setSalary(rs.getInt(4));
                d.setAddress(rs.getString(5));
                d.setAvailability(rs.getBoolean(6) ? 1 : 0);
                drivers.add(d);

            }
            return drivers;
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cnx != null) cnx.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
        return drivers;
    }



}
