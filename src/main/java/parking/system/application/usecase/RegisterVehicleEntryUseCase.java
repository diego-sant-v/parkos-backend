package parking.system.application.usecase;

import org.springframework.stereotype.Service;
import parking.system.application.port.outbound.ParkingRepositoryPort;
import parking.system.domain.model.VehicleModel;
@Service
public class RegisterVehicleEntryUseCase {
    private final ParkingRepositoryPort parkingRepositoryPort;

    public RegisterVehicleEntryUseCase(ParkingRepositoryPort parkingRepositoryPort) {
        this.parkingRepositoryPort = parkingRepositoryPort;
    }

    public VehicleModel park(VehicleModel vehicleModel){
        return parkingRepositoryPort.park(vehicleModel);//sem regras de negocio por hora
    }
}
