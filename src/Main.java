import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AirLines airFrance = new AirLines("AIRFRANCE","FRANCE", "AF","Notre Dam"
                ,0,new ArrayList<>());
        airFrance.displayAirlinesInfo();
        Plane plane = new Plane(108,"jones", "w4",
                new Pilot("josh","hart",51,8));
        plane.displayPlaneInfo();
        Pilot pilot = new Pilot("Hayk","Alekyan",18,2);

        airFrance.showMenu();
    }
   }