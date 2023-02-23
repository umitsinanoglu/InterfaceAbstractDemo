import business.concretes.VehicleManager;
import core.jLoggerManagerAdapter;
import entities.abstracts.Vehicle;
import entities.concretes.Car;
import entities.concretes.ElectricEngine;

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Car(new ElectricEngine());
        VehicleManager vehicleManager = new VehicleManager(new jLoggerManagerAdapter());
        vehicleManager.add(car1);
        System.out.println("--------------------------------");
        car1.drive();


    }
}
