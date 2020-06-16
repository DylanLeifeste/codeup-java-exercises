package AbstractionMiniExercise;

public class Refrigerator extends Appliance {
    @Override
    public void makeSound() {
        System.out.println("hmmmmmmmmmmmmmmm");
    }

    @Override
    public void doWork() {
        System.out.println("open..LIGHT ON....close..LIGHT OFF...always cooling");
    }
}

