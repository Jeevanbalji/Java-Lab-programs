interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public void calculateCharge() {
        int charge;

        if (parkingHours <= 2)
            charge = parkingHours * 20;
        else
            charge = 40 + (parkingHours - 2) * 10;

        System.out.println("Parking Charge: Rs. " + charge);
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public void calculateCharge() {
        int charge;

        if (parkingHours <= 2)
            charge = parkingHours * 50;
        else
            charge = 100 + (parkingHours - 2) * 30;

        System.out.println("Parking Charge: Rs. " + charge);
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
    }
}

public class Parkingcost {
    public static void main(String[] args) {

        ParkingCharge p;

        p = new TwoWheeler("KA67EA0147", 4);
        p.displayParkingDetails();
        p.calculateCharge();

    

        p = new FourWheeler("KA50BN1720", 4);
        p.displayParkingDetails();
        p.calculateCharge();
    }
}