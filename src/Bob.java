import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Hey, whats up im Bob i guess...if you wanna chat say hi");


        String input;
        boolean greeting;

        do {
            input = sc.next();
            greeting = (!input.equals("bye"));

            if (input.endsWith("?")){
                System.out.println("sure");
            }
           else if (input.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }
           else if (input.equals("")){
                System.out.println("Fine. Be that way!");
            }
           else  {
                System.out.println("Whatever");
            }
        }while (greeting);




    }
}
