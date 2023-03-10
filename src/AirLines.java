import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirLines {
    private String name;
    private String country;
    private String code;
    private String address;
    private int numberOfPlanes;
    private List<Plane> planeList = new ArrayList<>();

    public AirLines(String name, String country, String code, String address, int numberOfPlanes, List<Plane> planeList) {
        this.name = name;
        this.country = country;
        this.code = code;
        this.address = address;
        this.numberOfPlanes = numberOfPlanes;
        this.planeList = planeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfPlanes() {
        return numberOfPlanes;
    }

    public void setNumberOfPlanes(int numberOfPlanes) {
        this.numberOfPlanes = numberOfPlanes;
    }

    public void displayAirlinesInfo() {
        System.out.println("-".repeat(30));
        System.out.println("Airlines name: " + getName() + '\n'
                + "Located in: " + getCountry() + '\n' +
                "Code: " + getCode() + '\n' +
                "Address: " + getAddress() + '\n' +
                "Number of planes: " + getNumberOfPlanes());
        System.out.println("-".repeat(30));
    }

    public boolean addPlanes(Plane plane) {
        if (planeList.contains(plane)) {
            System.out.println("plane has  already been added: " + plane.getPlaneBrand());
            return false;
        } else {
            planeList.add(plane);
            System.out.println("Plane added");
            plane.displayPlaneInfo();
        }
        return true;
    }

    public int qtyPlanes(){
        return this.planeList.size();
    }
    public int removePlane(String inputBrandName){
        int temp;
        for (Plane myPlane : planeList){
            if (myPlane.getPlaneBrand().equals(inputBrandName)){
                temp = planeList.indexOf(myPlane);
                planeList.remove(temp);
                System.out.println("The plane is successfully removed");
            }else{
                System.out.println("Such plane does not exist");
            }
        }
        return this.planeList.size();
    }

    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check the numbers of planes in the Airlines : ");
        System.out.println("B. Add a plane");
        System.out.println("C. Remove a plane");
        System.out.println("D. Print all plane");
        System.out.println("E. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {

                case 'A':
                    System.out.println("-".repeat(30));
                    System.out.println("Number of planes in airlines :" + qtyPlanes());
                    System.out.println("-".repeat(30));
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("Adding a plane");
                    System.out.println("Enter number of passenger sits: ");
                    int enterPassengerSeats = scanner.nextInt();
                    System.out.println("Add an engine type: ");
                    String enterEngineType = scanner.next();
                    System.out.println("Add a brand for plane");
                    String enterPlaneBrand = scanner.next();
                    addPlanes(new Plane(enterPassengerSeats,enterEngineType,enterPlaneBrand,new Pilot()));
                    System.out.println("Number of planes in the Airlines: " + qtyPlanes());

                    break;

                case 'C':
                    System.out.println("Removing a plane");
                    System.out.println("Enter plane brand to remove the plane");
                    String enterSearchPLaneBrand = scanner.next();



                    if (enterSearchPLaneBrand.length() >= 2) {
                        removePlane(enterSearchPLaneBrand);
                      // System.out.println("Number of planes after removing latter one :" + (planeList.size()));
                        System.out.println("Plane removed successfully");
                    } else {
                        System.out.println("Plane not found not found");
                    }

                    break;

                case 'D':
                    System.out.println("Printing all planes");
                    for (Plane allPlanes: planeList){
                       allPlanes.displayPlaneInfo();
                        System.out.println("-".repeat(30));
                    }
                    break;

                case 'E':
                    System.out.println("-".repeat(30));
                    break;

                default:
                    System.out.println();
                    System.out.println("Error: Invalid option. Please enter A, B, C, D, E");
                    break;
            }
        } while (option != 'E');
        System.out.println("Thank you for trusting our service");
    }
}


