import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Route {
    private List<Station> stations;
    private List<Vehicle> vehicles;
    private UUID id;

    public UUID getID() {
        return id;
    }


    public List<Station> getStations() {
        return stations;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Route() {
        this.id= UUID.randomUUID();
        this.stations= new ArrayList<>();
        this.vehicles= new ArrayList<>();
    }
    public void addStation(Station station){
        if(!stations.contains(station)){
        stations.add(station);
        System.out.println("Station added successful!");
        }else{
            System.out.println("Cannot add this station!");
        }
    }
    public void addVehicle(Vehicle vehicle){
        if(!vehicles.contains(vehicle) && vehicle.getStatus()==VehicleStatus.IN_OPERATION){
            vehicles.add(vehicle);
            System.out.println("Vehicle added with success!");
        } else{
            System.out.println("Cannot add this vehicle!");
        }
    }

    public void displayStations(){
        for(Station s: stations){
            System.out.println(s.getName());
        }
    }

    public void displayVehicles(){
        for(Vehicle v: vehicles){
            System.out.println(v.getVin());
        }
    }
}
