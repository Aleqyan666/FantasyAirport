public class MilitaryPlane extends Plane{
    private double maxSpeed;
    private boolean hasWeapons;
    private boolean isRemote;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isHasWeapons() {
        return hasWeapons;
    }

    public void setHasWeapons(boolean hasWeapons) {
        this.hasWeapons = hasWeapons;
    }

    public boolean isRemote() {
        return isRemote;
    }

    public void setRemote(boolean remote) {
        isRemote = remote;
    }

    public MilitaryPlane(int passengerSeats, String engineType, String planeBrand, Pilot pilot, double maxSpeed, boolean hasWeapons, boolean isRemote) {
        super(passengerSeats, engineType, planeBrand, pilot);
        this.maxSpeed = maxSpeed;
        this.hasWeapons = hasWeapons;
        this.isRemote = isRemote;


    }
}
