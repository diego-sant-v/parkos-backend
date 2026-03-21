package parking.system.application.port.outbound;

import parking.system.domain.model.VehicleModel;

import java.util.List;

public interface ParkingRepositoryPort {
    VehicleModel park(VehicleModel vehicleModel);
    List<VehicleModel> findAll();

    long countParked();
}
