public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle(VehicleFactory.VehicleType.CAR);
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle(VehicleFactory.VehicleType.BIKE);
        bike.drive();

        Vehicle van = VehicleFactory.getVehicle(VehicleFactory.VehicleType.VAN);
        van.drive();
    }
}
