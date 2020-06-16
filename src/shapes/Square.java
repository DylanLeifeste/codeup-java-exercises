package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    // public int side;

    public int getArea() {
        return length * width;
    }


    public int getPerimiter() {
        return length * 4;
    }
}
