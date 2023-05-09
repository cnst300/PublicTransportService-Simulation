import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Bus extends Vehicle{
    private int pollutionIndicator;
    public Bus( String licensePlate, int capacity, LocalDate serviceDate, int pollutionIndicator) {
        super( licensePlate, capacity, serviceDate);
        this.pollutionIndicator=pollutionIndicator;
        this.setType(VehicleType.BUS);
        this.setFuel(VehicleFuel.GAS);

        long months= LocalDate.now().minusMonths(serviceDate.getMonthValue()).getMonthValue();

        if(months>=0 && months<=6 && pollutionIndicator>5){
            this.setStatus(VehicleStatus.IN_OPERATION);
        } else if ((months>0 && months<12) && (pollutionIndicator>=3 && pollutionIndicator<=5)) {
            this.setStatus(VehicleStatus.NEED_REPAIR);
        }
        else{
            this.setStatus(VehicleStatus.FOR_SCRAP);
        }
    }
}
