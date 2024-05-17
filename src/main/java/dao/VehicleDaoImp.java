package dao;

import models.Driver;
import models.Vehicle;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImp implements VehicleDao{
    Connection cnx ;
    PreparedStatement ps;
    ResultSet rs;


    public Vehicle SearchVehicle(int weight) {
        cnx = ConnectionDB.getConnection();
        List<Vehicle> vehicles = new ArrayList<>();
        String strQuery = "SELECT t.*\n" +
                "FROM truck t\n" +
                "JOIN driver d ON t.assigned_to = d.code\n" +
                "WHERE d.availability = 1;\n";
        try {
            ps = cnx.prepareStatement(strQuery);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vehicle v = new Vehicle();
                v.setCode(rs.getInt(1));
                v.setCapacity(rs.getInt(5));
                System.out.println("ID :" + v.getCode());
                System.out.println("Capacity :"+v.getCapacity());
                vehicles.add(v);
            }
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getCapacity() - weight >= 200) {
                    return vehicle;
                } else {

                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cnx != null) cnx.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
        return null;

    }
}
