package InheritanceAndPolymorphMiniExercises;

public class Jet extends Vehicle {
    private int maximumAltitude;

    public void takeOff(){
        System.out.println("Taking off....");
    }

    public Jet(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public Jet(boolean isOperable, int passangerCapacity, String powersource, int maximumAltitude) {
        super(isOperable, passangerCapacity, powersource);
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public void turnOn(){
        System.out.println("Igniting Jet Engines");
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude = " + maximumAltitude +
                ", isOperable = " + isOperable +
                ", passangerCapacity = " + passangerCapacity +
                ", powersource = '" + powersource + '\'' +
                '}';
    }
}
