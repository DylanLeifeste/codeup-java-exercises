package InheritanceAndPolymorphMiniExercises;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle corolla = new Vehicle();
        Car tesla = new Car(true, 3, "Electric", 100);
        Car test = new Car(true, 2, "imagination", 1);
        Jet f22 = new Jet(true, 2, "Jet Fuel", 17000);


        

        corolla.setOperable(true);
        corolla.setPassangerCapacity(3);
        corolla.setPowersource("Gasolina 83");


//        tesla.setOperable(true);
//        tesla.setPassangerCapacity(4);
//        tesla.setPowersource("Elon Musks Brain");

//        f22.setOperable(false);
//        f22.setPassangerCapacity(2);
//        f22.setPowersource("Jet Fuel");

        System.out.println("Testing mpg " + test.toString());
        test.deployAirBag();
        System.out.println("---------------------------------");
        System.out.println("Corolla: " + corolla.toString());
        System.out.println("---------------------------------");
        System.out.println("Tesla: " + tesla.toString());
        tesla.deployAirBag();
        System.out.println("---------------------------------");
        System.out.println("f22: " + f22.toString());
        f22.takeOff();
    }
}
