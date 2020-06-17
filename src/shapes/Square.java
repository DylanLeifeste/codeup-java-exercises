package shapes;

public class Square extends Quadrilateral{

    public Square(){

    }

    public Square(double length, double width) {
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
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
