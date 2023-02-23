package entities.concretes;

import entities.abstracts.Engine;
import entities.abstracts.Vehicle;

public class Truck implements Vehicle {

    private Engine engine;

    public Truck(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String getName() {
        return null;
    }

}
