public class VehicleFactory {

    enum VehicleType {
        CAR, BIKE, VAN
    }

    public static Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car();
            case BIKE:
                return new Bike();
            case VAN:
                return new Van();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
}
