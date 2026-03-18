package parking.system.adapters.inbound.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;
import parking.system.application.usecase.RegisterVehicleEntryUseCase;
import parking.system.domain.model.VehicleModel;

import java.util.List;

@RestController
@RequestMapping("/parking")
@CrossOrigin(origins = "*")
public class ParkingController {
    private final RegisterVehicleEntryUseCase registerVehicleEntryUseCase;

    public ParkingController(RegisterVehicleEntryUseCase registerVehicleEntryUseCase) {
        this.registerVehicleEntryUseCase = registerVehicleEntryUseCase;
    }

    @PostMapping("/park")
    private VehicleModel parkCar(@RequestBody VehicleModel vehicle){
        return registerVehicleEntryUseCase.park(vehicle);
    }

    @GetMapping("/findAll")
    private List<VehicleModel> findAll(){
        return registerVehicleEntryUseCase.findAll();
    }
}
