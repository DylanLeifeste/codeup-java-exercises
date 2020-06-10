import java.util.Scanner;

public class HighLow {

   static Scanner sc = new Scanner(System.in);

    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min){
            System.out.println("Please enter a number within the range");
            return getInteger(min, max);
        }
        return userInput;
    }

        public static void guessingGame(int guess, int answer){
            if(guess == answer){
                System.out.println("You got it!");
            }else if (guess < answer){
                System.out.println("HIGHER");
                guessingGame(getInteger(1,100), answer);
            }else {
                System.out.println("LOWER");
                guessingGame(getInteger(1,100), answer);
            }
        }
    public static void main(String[] args) {
        System.out.println("Lets play a game!!!!");
        do {
            int answer = (int) (Math.random() * 100) + 1;
            System.out.println("Try to guess what number i'm thinking of...if you can >;D");
            guessingGame(getInteger(1,100), answer);
            System.out.println("Wanna go on?(y/n)");
        } while (sc.next().equalsIgnoreCase("Y"));
    }
}
