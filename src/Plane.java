public  class Plane{
    private int passengerSeats;
    private String engineType;
    private String planeBrand;
    private Pilot pilot;

    public Plane(int passengerSeats, String engineType, String planeBrand, Pilot pilot) {
        this.passengerSeats = passengerSeats;
        this.engineType = engineType;
        this.planeBrand = planeBrand;
        this.pilot = pilot;
    }


    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getPlaneBrand() {
        return planeBrand;
    }

    public void setPlaneBrand(String planeBrand) {
        this.planeBrand = planeBrand;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }


    public void startEngine(){
        System.out.println("Engine started: ");
    }

    public void displayPlaneInfo(){
        System.out.println("-".repeat(30));
        System.out.println("Number of seats: " + getPassengerSeats() + '\n'
                + "Engine type: " + getEngineType() + '\n' +
                "Plane Brand: " + getPlaneBrand() + '\n' +
                "Pilot: " + getPilot().getName()  + '\n' );
        System.out.println("-".repeat(30));
    }

}
