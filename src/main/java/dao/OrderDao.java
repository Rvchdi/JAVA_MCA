package dao;

import models.Order;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface OrderDao {
    default void add(Order order) {
        try (Connection cnx = ConnectionDB.getConnection();

             PreparedStatement ps = cnx.prepareStatement("INSERT INTO orders (name, status, type, start_location, destination, distance, cost, weight, client_id, id_truck, delivery_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
        {

            ps.setString(1, order.getName());
            ps.setString(2, order.getStatus());
            ps.setString(3, order.getType());
            ps.setString(4, order.getPickup_city());
            ps.setString(5, order.getDestination());
            ps.setDouble(6, order.getDistance());
            ps.setDouble(7, order.getCost());
            ps.setInt(8, order.getWeight());
            ps.setInt(9, 1);
            ps.setInt(10, order.getVehicle_id());
            ps.setString(11, order.getDate());
            ps.executeUpdate();
            String updateQuery = "UPDATE driver SET availability = NOT availability WHERE code = (SELECT assigned_to FROM truck WHERE id = ?)";

            PreparedStatement updateStatement = cnx.prepareStatement(updateQuery);
            updateStatement.setInt(1,order.getVehicle_id());
            updateStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error adding order: " + e.getMessage(), e);
        }
    }
}
