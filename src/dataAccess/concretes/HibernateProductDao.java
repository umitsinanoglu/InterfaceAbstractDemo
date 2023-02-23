package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.abstracts.Vehicle;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Vehicle product) {

    }

    @Override
    public void update(Vehicle product) {

    }

    @Override
    public void delete(Vehicle product) {

    }

    @Override
    public Vehicle get(int id) {
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }
}
