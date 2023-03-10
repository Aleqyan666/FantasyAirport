public class CargoPlane extends Plane {
    private double capacityVolume; //in m³
    private boolean containsExplosives;

    public CargoPlane(int passengerSeats, String engineType, String planeBrand, Pilot pilot, double capacityVolume, boolean containsExplosives) {
        super(passengerSeats, engineType, planeBrand, pilot);
        this.capacityVolume = capacityVolume;
        this.containsExplosives = containsExplosives;
    }


}
