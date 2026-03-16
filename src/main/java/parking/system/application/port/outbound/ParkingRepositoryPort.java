package parking.system.application.port.outbound;

import parking.system.domain.model.VehicleModel;

public interface ParkingRepositoryPort {
    VehicleModel park(VehicleModel vehicleModel);
}
