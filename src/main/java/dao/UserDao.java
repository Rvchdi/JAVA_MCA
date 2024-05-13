package dao;

import models.Client;
import models.User;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface UserDao {
    Connection cnx = ConnectionDB.getConnection();
    User connectUser(String username, String password);

    public default void add(Client client) {
        try {
            PreparedStatement ps;
            String strQuery = "INSERT INTO client(name, CIN,address,birthdate,email,pwd) VALUES (?,?,?,?,?,?)";
            ps = cnx.prepareStatement(strQuery);
            ps.setString(1, Client.getName());
            ps.setString(2, Client.getCin());
            ps.setString(3, Client.getAddress());
            ps.setString(4, Client.getBirthdate());
            ps.setString(5, Client.getEmail());
            ps.setString(6, Client.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

