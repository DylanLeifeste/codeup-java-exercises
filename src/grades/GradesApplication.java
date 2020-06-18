package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student dylan = new Student("Dylan");
        dylan.addGrade(100);
        dylan.addGrade(95);
        dylan.addGrade(85);

        Student fernando = new Student("Fernando");
        fernando.addGrade(100);
        fernando.addGrade(95);
        fernando.addGrade(85);

        Student duck = new Student("RubberDuck");
        duck.addGrade(25);
        duck.addGrade(75);
        duck.addGrade(100);

        Student bruce = new Student("Bruce Wayne");
        bruce.addGrade(100);
        bruce.addGrade(100);
        bruce.addGrade(97);

        students.put("Dylan4122", dylan);
        students.put("CubanDude97", fernando);
        students.put("Quacker", duck);
        students.put("NotBatMan", bruce);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here is the list of GitHub usernames of the students:");
        System.out.println();
        System.out.println(students.keySet());
        System.out.println();
        System.out.println("What student would you like to see more info on?");

        Scanner sc = new Scanner(System.in);
        String userinput = sc.next();

        if (userinput.equalsIgnoreCase("dylan4122")){
            System.out.println();
            System.out.println("Students name: " + dylan.getName());
            System.out.println("Grade Avg: " + dylan.getGradeAverage());
        } else if (userinput.equalsIgnoreCase("cubandude97")){
            System.out.println();
            System.out.println("Students name: " + fernando.getName());
            System.out.println("Grade Avg: " + fernando.getGradeAverage());
        } else if (userinput.equalsIgnoreCase("quacker")){
            System.out.println();
            System.out.println("Students name: " + duck.getName());
            System.out.println("Grade Avg: " + duck.getGradeAverage());
        } else if (userinput.equalsIgnoreCase("notbatman")){
            System.out.println();
            System.out.println("Students name: " + bruce.getName());
            System.out.println("Grade Avg: " + bruce.getGradeAverage());
        } else {
            System.out.println("It appears we do not have that user...please try again");
            sc.next();
        }


    }
}
