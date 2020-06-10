import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15 ){
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");

        for (int z = 100; z >= -10; z-=5) {
            System.out.println(z);
        }

        System.out.println(" ");

        for (long l = 2; l <= 1000000; l *= l ) {
            System.out.println(l);
        }

        System.out.println(" ");

        for (int g = 1; g <= 100; g++){
            if (((g % 3) == 0) && ((g % 5) == 0)){
                System.out.println("FizzBuzz ");
            } else if (g % 5 == 0)   {
                System.out.println("Buzz ");
            } else if (g % 3 == 0) {
                System.out.println("Fizz ");
            } else {
                System.out.println(g);
            }
        }

        System.out.println(" ");

        Scanner userInput = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int num = userInput.nextInt();

        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int y = 1; y <= num; y++){
            System.out.printf("%d      | %d       | %d%n", y, y*y, y*y*y);
        }

        System.out.println(" ");

        System.out.println("Would you like to take a look at your letter grades?");
        String answer = userInput.next();

        while(answer.equalsIgnoreCase("YES")){
            System.out.println("Please enter the numeric grade:");
            int grade = userInput.nextInt();

            char letterGrade;
            if(grade >= 88){
                letterGrade = 'A';
            } else if(grade >= 80){
                letterGrade = 'B';
            } else if (grade >= 67){
                letterGrade = 'C';
            } else if (grade >= 60){
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("Your letter grade is: %c.%n", letterGrade);

            System.out.println("Do you want to check more grades?");
            answer = userInput.next();
        }


    }
}
