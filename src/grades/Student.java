package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grade;

    private String studentsName;

    public Student(String name) {
        this.grade = new ArrayList<>();
        this.studentsName = name;
    }

    public String getName(){
        return this.studentsName;
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage(){
       double sum = 0;
       for (double i = 0; i < grade.size(); i++){
           sum += this.grade.get((int) i);
       }
       return sum / grade.size();
    }

    public static void main(String[] args) {
        Student dylan = new Student("Dylan Leifeste");
        dylan.addGrade(85);
        dylan.addGrade(75);
        dylan.addGrade(65);
        dylan.addGrade(95);

        Student fernando = new Student("Fernando Hernandez");
        fernando.addGrade(85);
        fernando.addGrade(75);
        fernando.addGrade(60);
        fernando.addGrade(100);

        System.out.println("Student: " + dylan.getName());
        System.out.println("Avg Grade: " + dylan.getGradeAverage());
        System.out.println();
        System.out.println("Student: " + fernando.getName());
        System.out.println("Avg Grade " + fernando.getGradeAverage());
    }
}
