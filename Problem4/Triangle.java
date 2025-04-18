public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // constructor
    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        } else {
            System.out.println("invalid triangle sides");
            System.exit(0);
        }
    }

    // get side1
    public double getSide1() {
        return side1;
    }

    // set side1
    public void setSide1(double s1) {
        side1 = s1;
    }

    // get side2
    public double getSide2() {
        return side2;
    }

    // set side2
    public void setSide2(double s2) {
        side2 = s2;
    }

    // get side3
    public double getSide3() {
        return side3;
    }

    // set side3
    public void setSide3(double s3) {
        side3 = s3;
    }

    // get area
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // get perimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // scale
    @Override
    public void scale(double factor) {
        side1 = side1 * factor;
        side2 = side2 * factor;
        side3 = side3 * factor;
    }
}
