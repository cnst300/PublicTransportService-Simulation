import java.time.LocalDate;
import java.util.UUID;

public class Tram extends Vehicle{
    private int yearsInService;
    public Tram(String licensePlate, int capacity, LocalDate serviceDate, int yearsInService) {
        super( licensePlate, capacity, serviceDate);
        this.setType(VehicleType.TRAM);
        this.setFuel(VehicleFuel.ELECTRIC);
        this.yearsInService=yearsInService;
    }
}
