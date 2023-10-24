package D_Override;

public class D_Override {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.getWheels();
        vehicle.getColour();

        Car car =new Car();
        car.getWheels();
        car.getColour();

        Vehicle vehicleUp = new Car();
        vehicleUp.getColour();

        Car carDown = (Car)new Vehicle();
        carDown.getColour();
    }
}
