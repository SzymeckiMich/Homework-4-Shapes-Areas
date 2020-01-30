public class Rectangle {
    private double shortSide;
    private double longSide;

    public Rectangle(double shortSide, double longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public Rectangle() {
    }

    public double getShortSide() {
        return shortSide;
    }

    public void setShortSide(double shortSide) {
        this.shortSide = shortSide;
    }

    public double getLongSide() {
        return longSide;
    }

    public void setLongSide(double longSide) {
        this.longSide = longSide;
    }

    double rectArea() {
        return this.longSide * this.shortSide;
    }

    double rectPerimeter() {
        return 2 * (this.shortSide + this.longSide);
    }
}
