package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean YesNo() {
        String input = getString();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input. please enter a valid integer");
            sc.next();
            return getInt();
        }
    }
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max){
            return userInt;
        } else {
            System.out.println("Pleae enter a valid number between " + min + " and " + max);
            return getInt(min, max);
        }
    }   public double getDouble() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Invalid input. please enter a valid integer");
            sc.next();
            return getDouble();
        }
    }
    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max){
            return userDouble;
        } else {
            System.out.println("Pleae enter a valid number between " + min + " and " + max);
            return getDouble(min, max);
        }
    }

}
