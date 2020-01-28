public class Rectangle {
    double shortSide;
    double longSide;

    public Rectangle(double shortSide, double longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    double rectArea(Rectangle rectangle) {
        return rectangle.longSide * rectangle.shortSide;
    }

    double rectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.shortSide + rectangle.longSide);
    }
}
