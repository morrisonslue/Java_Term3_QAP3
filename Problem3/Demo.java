public class Demo {
    public static void main(String[] args) {
        // create shapes
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Wide ellipse", 8.0, 4.0);
        shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Perfect triangle", 6.0);

        // loop and print
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
