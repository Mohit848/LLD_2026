package org.example;

import Entities.LuxuryVehicle;
import Entities.OffRoadVehicle;
import Entities.Vehicle;
import Entities.VehicleDrive.LuxuryDrive;
import Entities.VehicleDrive.OffRoadDrive;

public class Main {
    public static void main(String[] args) {
        //Strategy pattern implementation below
        Vehicle merc = new LuxuryVehicle(new LuxuryDrive());
        Vehicle thar = new OffRoadVehicle(new OffRoadDrive());
        merc.drive();
        thar.drive();
    }
}