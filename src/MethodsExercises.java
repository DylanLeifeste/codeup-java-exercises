import java.util.Scanner;


public class MethodsExercises {

   static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static double addition(int input1, int input2){
        return input1 + input2;
}

    public static double subtraction(int input1, int input2){
        return input1 - input2;
    }

    public static double multiplication(int input1, int input2){
        return input1 * input2;
    }

    public static double division(int input1, int input2){
        return  input1 / input2;
    }

    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min){
            System.out.println("Please enter a number within the range");
            return getInteger(min, max);
        }
        System.out.println("Thanks for entering a valid number!");
        return userInput;
    }
// Factorials with recursion
    public static long factorialRecursion(int x){
    if(x <= 1){
        return 1;
    }
    return x * factorialRecursion(x - 1);
}

    public static void rollDice(int sides){
        int firstDice = (int)(Math.random() * sides) + 1;
        int secondDice = (int)(Math.random() * sides) + 1;
        System.out.printf("1st Result: %d | 2nd Result: %d%n", firstDice, secondDice);
    }

    public static void main(String[] args) {
        System.out.println(addition(2, 2));
        System.out.println(subtraction(17, 7));
        System.out.println(multiplication(5, 15));
        System.out.println(division(15, 3));
        // call recursion
//        System.out.println(factorialRecursion(1));

        int myInt = getInteger(1, 10);
        System.out.println(myInt);

        // exercise 3
        int number;
        String repsonse;
        long fact = 1;
        do {
            number = getInteger(1, 10);
            System.out.println("Calculate factorial of " + number + "! ?");
            System.out.println("continue?(y/n)");
            repsonse = sc.next();
        } while (!repsonse.equalsIgnoreCase("y"));

        System.out.print(number + "! =  ");
        // Factorial without recursion
        for(int i = 1; i <= number; i++){
            fact = fact * i;
            if (i < number){
                System.out.print(i + " x ");
            }
            else {
                System.out.println(i + " = " + fact);
            }
        }
// DICE ROLLLLLLL
        do{
            System.out.println("Let's roll a pair of dice. How many sides? ");
            rollDice(getInteger(1,10));
            System.out.println("Would you like to continue?(y/n)");
        }while(sc.next().equalsIgnoreCase("y"));
    }
}
