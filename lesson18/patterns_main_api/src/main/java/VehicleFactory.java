public interface VehicleFactory {
    Body createBody();
    Chassis createChassis();
    Windows createWindows();
}
