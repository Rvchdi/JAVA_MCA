package dao;

import models.Client;
import models.Entreprise;

import java.util.List;

public interface EntrepriseDao {
    List<Entreprise> getAll();
    Entreprise getById(int id);
    void add(Client client);
    void update(Entreprise entreprise);
    void delete(int id);


}
