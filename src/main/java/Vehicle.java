import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

abstract class Vehicle {
    private UUID vin;
    private String licensePlate;
    private int capacity;
    private VehicleType type;
    private VehicleFuel fuel;
    private VehicleStatus status;

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    private LocalDate serviceDate;

    public VehicleStatus getStatus() {
        return status;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public UUID getVin() {
        return vin;
    }

    public void setFuel(VehicleFuel fuel) {
        this.fuel = fuel;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public VehicleType getType() {
        return type;
    }

    public Vehicle(String licensePlate, int capacity, LocalDate serviceDate) {
        this.vin = UUID.randomUUID();
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.serviceDate = serviceDate;
        this.type = null;
        this.fuel= null;

        long months= LocalDate.now().minusMonths(serviceDate.getMonthValue()).getMonthValue();
        if (months >= 0 && months <= 6) {
            this.status = VehicleStatus.IN_OPERATION;
        } else if (months >= 7 && months <= 36) {
            this.status = VehicleStatus.NEED_REPAIR;
        } else {
            this.status = VehicleStatus.FOR_SCRAP;
        }
    }

}
