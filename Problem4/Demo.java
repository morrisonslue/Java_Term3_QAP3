public class Demo {

    // static method to scale shapes
    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable s : shapes) {
            s.scale(factor);
        }
    }

    public static void main(String[] args) {
        // create shapes
        Circle c = new Circle("Circle one", 5);
        Ellipse e = new Ellipse("Oval", 7, 4);
        Triangle t = new Triangle("Triangle", 5, 6, 7);
        EquilateralTriangle eq = new EquilateralTriangle("Perfect triangle", 3);

        // shape array
        Shape[] shapes = { c, e, t, eq };

        System.out.println("Shapes Before Scaling");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // scale factor
        double factor = 2.0;

        // call scale method
        System.out.println("\nScaling shapes by factor of " + factor + "\n");
        Scalable[] scalables = { c, e, t, eq };
        scaleAll(scalables, factor);

        System.out.println("Shapes After Scaling");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
