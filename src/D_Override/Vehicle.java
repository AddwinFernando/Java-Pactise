package D_Override;

public class Vehicle {
    int wheels = 4;

    public void getColour(){
        System.out.println("Colour - Green (Parent)");
    }

    public void getWheels() {
        System.out.println("The number of wheels: "+this.wheels);
    }
}
