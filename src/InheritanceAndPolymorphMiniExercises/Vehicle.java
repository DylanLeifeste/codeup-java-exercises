package InheritanceAndPolymorphMiniExercises;

public class Vehicle {
    boolean isOperable;
    int passangerCapacity;
    String powersource;

    public Vehicle(){

    }

    public Vehicle(boolean isOperable, int passangerCapacity, String powersource) {
        this.isOperable = isOperable;
        this.passangerCapacity = passangerCapacity;
        this.powersource = powersource;
    }

    public boolean isOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    public String getPowersource() {
        return powersource;
    }

    public void setPowersource(String powersource) {
        this.powersource = powersource;
    }

    public void turnOn(){
        System.out.println("Vehicle is turning on");
    }

    public String toString() {
        return  "is Operable: " + isOperable + "\n Capacity: " + passangerCapacity + "\n power source: " + powersource;
    }
}
