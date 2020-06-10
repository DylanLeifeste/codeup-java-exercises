import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f ", pi);
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a Integer: ");
        int num = sc.nextInt();
        System.out.println("The number you entered was: " + num);

        System.out.print("Please enter three words: ");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        System.out.print("Please enter a sentence: ");
        sc.nextLine();
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.print("please enter length of room in ft:");
        int length = Integer.parseInt(sc.nextLine());
        System.out.print("please enter Width of room in ft:");
        int width = Integer.parseInt(sc.nextLine());
        int area = length * width;
        int perimeter = (length + width) * 2;
        System.out.printf("The are of the room is %d%n The perimeter of the room is %d", area, perimeter);

    }
}
