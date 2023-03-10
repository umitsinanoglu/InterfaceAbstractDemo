package business.concretes;

import business.abstracts.VehicleService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.abstracts.Vehicle;

public class VehicleManager implements VehicleService {

    private final LoggerService loggerService;
    private ProductDao productDao;

    public VehicleManager(ProductDao productDao,
                          LoggerService loggerService) {
        super();
        this.loggerService = loggerService;
        this.productDao = productDao;
    }

    @Override
    public void add(Vehicle vehicle) {
        loggerService.logToSystem(vehicle.getName() + " is added");
    }
}
