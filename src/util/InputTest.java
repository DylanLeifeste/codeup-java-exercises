package util;

public class InputTest {

    public static void main(String[] args) {
        Input in = new Input();

        System.out.println("Please enter a word");
        String word = in.getString();
        System.out.println(word);

        System.out.println("Will you continue??");
        boolean yesNo = in.YesNo();
        System.out.println(yesNo);

        System.out.println("Please enter a whole number");
        int num = in.getInt();
        System.out.println("you entered " + num);

        System.out.println("please enter a number between 1 and 10");
        int numInRange = in.getInt(1, 10);
        System.out.println("you entered " + numInRange);

        System.out.println("please enter a number between 1.00 and 10.00");
        double doubleInRange = in.getDouble(1.00, 10.10);
        System.out.println("you entered " + doubleInRange);
    }
}
