package AbstractionMiniExercise;

public class Microwave extends Appliance {
    @Override
    public void makeSound() {
        System.out.println("beep..beep. click bvmmmmmmmmmmmmmmmmmmmmm beeeeep beeeep beeeep");
    }

    @Override
    public void doWork() {
        System.out.println("I heat stuff broh...");
    }
}
