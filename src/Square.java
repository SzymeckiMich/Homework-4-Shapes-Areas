public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    double squareArea() {
        return this.side * this.side;
    }

    double squarePerimeter() {
        return 4 * this.side;
    }
}
