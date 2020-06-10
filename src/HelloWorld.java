public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello, ");
        System.out.print("World!");
        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);

        String myString = "I like Turtles";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++); // increments next time x is used.
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);  // pre increments
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


        // Short handed Operations
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        x *= y;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        byte test = 127;
        System.out.println(++test);
        System.out.println(++test);
    }
}
