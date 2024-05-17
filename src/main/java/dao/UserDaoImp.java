package dao;

import models.User;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImp implements UserDao{
    private String strQuery;
    PreparedStatement ps;
    ResultSet rs;
    Connection cnx = ConnectionDB.getConnection();
    public boolean login(String email, String password) {
        boolean isAuthenticated = false;
        try {
            String strQuery = "SELECT * FROM client WHERE email = ? AND pwd = ?";
            ps = cnx.prepareStatement(strQuery);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();


            isAuthenticated = rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isAuthenticated;
    }
    public  User connectUser(String username, String password) {
        strQuery = "SELECT * FROM USERS WHERE username ? AND password = ?";
        try {
            ps = cnx.prepareStatement(strQuery);
            ps.setString(1, username);
            ps.setString(1, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                User user = new User(id, username, password);
                return user;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
