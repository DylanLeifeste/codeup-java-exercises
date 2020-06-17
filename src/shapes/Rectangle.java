package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(){

    }

    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public void setLength(double length, double width) {

    }

    @Override
    public void setWidth(double length, double width) {

    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
