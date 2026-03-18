package parking.system.adapters.outbound.persistence;

import org.springframework.stereotype.Component;
import parking.system.adapters.outbound.persistence.jpa.ParkingJpaRepository;
import parking.system.application.port.outbound.ParkingRepositoryPort;
import parking.system.domain.model.VehicleModel;

import java.util.List;

@Component
public class ParkingRepositoryAdapter implements ParkingRepositoryPort {

    private final ParkingJpaRepository repository;

    public ParkingRepositoryAdapter(ParkingJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public VehicleModel park(VehicleModel vehicleModel) {
        return repository.save(vehicleModel);
    }

    @Override
    public List<VehicleModel> findAll(){
        return repository.findAll();
    }
}