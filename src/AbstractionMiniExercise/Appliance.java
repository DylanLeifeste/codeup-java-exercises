package AbstractionMiniExercise;



public abstract class Appliance {
    private String brand;
    private String color;

    public abstract void makeSound();
    public abstract void doWork();

    public Appliance(){

    }

    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
