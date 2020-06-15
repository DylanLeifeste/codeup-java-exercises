package InheritanceAndPolymorphMiniExercises;

public class Car extends Vehicle {
    private int milesPerGallon;

//    public Car(){
//
//    }

    public Car(boolean isOperable, int passangerCapacity, String powersource, int milesPerGallon) {
        super(isOperable, passangerCapacity, powersource);
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirBag(){
        System.out.println("Deploying Airbag");
    }

    public void turnOn(){
        System.out.println("Cranking Engine");
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon = " + milesPerGallon +
                ", isOperable = " + isOperable +
                ", passangerCapacity = " + passangerCapacity +
                ", powersource = '" + powersource + '\'' +
                '}';
    }
}


