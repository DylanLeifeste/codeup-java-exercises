package InheritanceLecture;

public class Dog extends Animal {
    public String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeNoise(){
        System.out.println("Baark bark bark");
    }

    public void makeGenericAnimalNoise(){
        super.makeNoise();
    }

    @Override
    public String toString() {
        return "Dog{" + "Species: " + this.getSpecies() + "/ " + "age: " + this.getAge() + "/ " + "breed: " + breed + '\'' + '}';

    }
}
