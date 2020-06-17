package shapes;

public class ShapesTest {

    public static void main(String[] args) {

          Measurable myShape = new Square(5, 5);
          Measurable myShape1 = new Rectangle(10, 5);

        System.out.println("Square:");
        System.out.println("Squares Area: " + myShape.getArea());
        System.out.println("Squares Perimeter: " + myShape.getPerimeter());
        System.out.println("-----------------------------");
        System.out.println("Rectangle:");
        System.out.println("Rectangles Area: " + myShape1.getArea());
        System.out.println("Rectangles Perimeter: " + myShape1.getPerimeter());


    }
}
