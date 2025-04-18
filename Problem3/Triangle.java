public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);

        // triangle validation
        if (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("triangle not valid");
            System.exit(1);
        }
    }

    // get perimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // get area
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // getter methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // setter methods
    public void setSides(double side1, double side2, double side3) {
        if (side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("triangle not valid");
        }
    }
}
