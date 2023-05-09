import java.util.ArrayList;
import java.util.List;

public class TransportCompany {
    private List<Vehicle> vehicles;
    private List<Route> routes;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public TransportCompany() {
        this.routes= new ArrayList<>();
        this.vehicles= new ArrayList<>();
    }

    public List<Vehicle> searchVehicleWithTypeAndStatus(VehicleType type, VehicleStatus status){
        List<Vehicle> matchingVehicles= new ArrayList<>();
        for (int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i).getStatus()==status && vehicles.get(i).getType()==type){
                matchingVehicles.add(vehicles.get(i));
            }
        }
        return  matchingVehicles;
    }

    public void addVehicle(Vehicle vehicle){
        if(!vehicles.contains(vehicle)){
            vehicles.add(vehicle);
            System.out.println("Vehicle added successful!");
        }
    }

    public void addRoute(Route route){
        if (!routes.contains(route) && route.getStations().size()>2){
            routes.add(route);
            System.out.println("Route added successful!");
        }
    }

    public List<Route> trackRoutes() {
        return routes;
    }


}
