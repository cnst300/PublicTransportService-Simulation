import java.time.LocalDate;
import java.util.UUID;

public class Trolleybus extends Vehicle{
    public Trolleybus( String licensePlate, int capacity, LocalDate serviceDate) {
        super( licensePlate, capacity, serviceDate);
        this.setType(VehicleType.TROLLEYBUS);
        this.setFuel(VehicleFuel.HYBRID);
    }
}
