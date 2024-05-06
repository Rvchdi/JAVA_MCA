package dao;

import models.Client;
import models.Entreprise;
import utils.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntrepriseDaoImp implements EntrepriseDao{
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    public EntrepriseDaoImp(){
        cnx = ConnectionDB.getConnection();
    }

    @Override
    public List<Entreprise> getAll() {
        List<Entreprise> entreprises = new ArrayList<>();
        String strQuery="SELECT * FROM entreprise";
        try {
            ps = cnx.prepareStatement(strQuery);
            rs = ps.executeQuery();
            while (rs.next()){
                Entreprise e = new Entreprise();
                e.setNum(rs.getInt(1));
                e.setNom(rs.getString(2));
                e.setAdresse(rs.getString(3));
                entreprises.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return entreprises;
    }

    @Override
    public Entreprise getById(int id) {
        String strQuery="SELECT * FROM entreprise WHERE nume = ?";
        try {
            ps = cnx.prepareStatement(strQuery);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                Entreprise e = new Entreprise();
                e.setNum(rs.getInt(1));
                e.setNom(rs.getString(2));
                e.setAdresse(rs.getString(3));
                return e;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    @Override

    public void add(Client client) {
        try {
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

    @Override
    public void update(Entreprise entreprise) {
            try {
                String strQuery = "UPDATE entreprise SET nome = ?, adresse = ? WHERE nume = ?";
                ps = cnx.prepareStatement(strQuery);
                ps.setString(1, entreprise.getNom());
                ps.setString(2, entreprise.getAdresse());
                ps.setInt(3, entreprise.getNum());
                ps.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
    @Override
    public void delete(int id) {
        try {
            String strQuery = "DELETE FROM entreprise WHERE nume = ?";
            ps = cnx.prepareStatement(strQuery);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
