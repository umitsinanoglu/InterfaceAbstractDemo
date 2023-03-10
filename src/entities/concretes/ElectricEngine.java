package entities.concretes;

import entities.abstracts.Engine;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}
