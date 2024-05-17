package dao;

import utils.ConnectionDB;

import java.sql.Connection;

public interface VehicleDao {
    Connection cnx = ConnectionDB.getConnection();

}
