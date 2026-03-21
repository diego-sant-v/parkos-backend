package parking.system.domain.model;

import jakarta.persistence.*;
import parking.system.domain.enums.CategoryEnum;
import parking.system.domain.enums.FuelEnum;
import parking.system.domain.enums.PreferredSectorEnum;

import java.util.UUID;

@Entity
@Table(name = "vehicle")
public class VehicleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    private DriverVehicle driverVehicle;
    private String carLicensePlate;
    private String color;
    private String model;
    private String mark;
    private String photoUrl;
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;
    @Enumerated(EnumType.STRING)
    private FuelEnum fuel;
    @Enumerated(EnumType.STRING)
    private PreferredSectorEnum preferredSector;
    private int manufactureYear;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public DriverVehicle getDriverVehicle() {
        return driverVehicle;
    }

    public void setDriverVehicle(DriverVehicle driverVehicle) {
        this.driverVehicle = driverVehicle;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public FuelEnum getFuel() {
        return fuel;
    }

    public void setFuel(FuelEnum fuel) {
        this.fuel = fuel;
    }

    public PreferredSectorEnum getPreferredSector() {
        return preferredSector;
    }

    public void setPreferredSector(PreferredSectorEnum preferredSector) {
        this.preferredSector = preferredSector;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
