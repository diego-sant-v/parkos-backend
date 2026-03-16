package parking.system.adapters.outbound.persistence.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import parking.system.domain.model.VehicleModel;

import java.util.UUID;

public interface ParkingJpaRepository extends JpaRepository<VehicleModel, UUID> {
}