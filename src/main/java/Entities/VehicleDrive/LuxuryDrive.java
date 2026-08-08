package Entities.VehicleDrive;

import Interfaces.DriveStrategy;

public class LuxuryDrive implements DriveStrategy {
    @Override
    public String getDriveType() {
        return "Luxury drive";
    }
}
