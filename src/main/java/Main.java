import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TransportCompany company= new TransportCompany();
        Vehicle vehicle1= new Bus("MH04MJT", 5, LocalDate.of(2023, 4, 05), 8);
        Station station1= new Station("Basarab");
        Station station2= new Station("Gara de nord");
        Route route1= new Route();
        Route route2= new Route();
        Route route3= new Route();
        route1.addStation(station1);
        route1.addStation(station2);
        route1.addStation(station2);
        route1.addVehicle(vehicle1);
        route1.addVehicle(vehicle1);
        company.getVehicles().add(vehicle1);
        company.getRoutes().add(route1);
        company.getRoutes().add(route2);
        company.getRoutes().add(route3);
        company.trackRoutes().get(0).displayVehicles();
        company.trackRoutes().get(0).displayStations();
    }
}
