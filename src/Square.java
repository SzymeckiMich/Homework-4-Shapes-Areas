public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    double squareArea(Square square) {
        return square.side * square.side;
    }

    double squarePerimeter(Square square) {
        return 4 * square.side;
    }
}
