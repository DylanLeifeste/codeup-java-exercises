package InheritanceLecture;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.setSpecies("primate");
        a.setAge(3);

        d.setBreed("Pug");
        d.setSpecies("Canine");
        d.setAge(3);

        d.makeNoise();
        d.makeGenericAnimalNoise();

//        System.out.println(d.toString());
    }
}
