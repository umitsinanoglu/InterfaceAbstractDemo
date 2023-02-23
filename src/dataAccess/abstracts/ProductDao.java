package dataAccess.abstracts;


import entities.abstracts.Vehicle;

import java.util.List;

public interface ProductDao {

    void add(Vehicle product);
    void update(Vehicle product);
    void delete(Vehicle product);
    Vehicle get(int id);
    List<Vehicle> getAll();

}
