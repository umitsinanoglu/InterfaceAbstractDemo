package business.concretes;

import business.abstracts.VehicleService;
import core.LoggerService;
import entities.abstracts.Vehicle;

public class VehicleManager implements VehicleService {

    private final LoggerService loggerService;

    public VehicleManager(LoggerService loggerService) {
        super();
        this.loggerService = loggerService;
    }

    @Override
    public void add(Vehicle vehicle) {
        loggerService.logToSystem(vehicle.getName() + " is added");
    }
}
