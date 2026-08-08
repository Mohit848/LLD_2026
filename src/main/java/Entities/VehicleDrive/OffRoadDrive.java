package Entities.VehicleDrive;

import Interfaces.DriveStrategy;

public class OffRoadDrive implements DriveStrategy {
    @Override
    public String getDriveType(){
        return "Off Road Drive";
    }
}
