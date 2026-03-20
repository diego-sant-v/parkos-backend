package parking.system.domain.model;

import jakarta.persistence.*;
import parking.system.domain.enums.TypeRegisterEnum;

import java.util.UUID;

@Entity
public class DriverVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String email;
    private String document;
    private String mobilePhone;
    private String company;
    private String observation;
    @Enumerated(EnumType.STRING)
    private TypeRegisterEnum typeRegister;
    private String licensePlate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public TypeRegisterEnum getTypeRegister() {
        return typeRegister;
    }

    public void setTypeRegister(TypeRegisterEnum typeRegister) {
        this.typeRegister = typeRegister;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
