import java.util.Arrays;


public class ArrayExercises {


    public static void main(String[] args) {

         Person[] names = {new Person("Arthur Morgan"), new Person("Dutch Van der linde"), new Person("John Marston")};

         Person[] people = addPerson(names);

         for (Person work : people ){
             System.out.println(work.getName());
         }

//        for (Person name : names) {
//            System.out.println(name.getName());
//        }

    }

    public static Person[] addPerson(Person[] Person) {
            Person[] addAnother = Arrays.copyOf(Person, Person.length + 1);
            addAnother[3] = new Person("Micha Bell");
            return addAnother;
    }
}
