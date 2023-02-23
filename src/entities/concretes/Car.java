package entities.concretes;

import entities.abstracts.Engine;
import entities.abstracts.Vehicle;

public class Car implements Vehicle {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String getName() {
        return "Mercedes";
    }
}
