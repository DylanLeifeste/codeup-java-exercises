package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(){

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimiter(){
        return (length * 2) + (width * 2);
    }

}
