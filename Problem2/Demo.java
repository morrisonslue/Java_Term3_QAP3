public class Demo {
    public static void main(String[] args) {
        // make point
        Point p1 = new Point(2.5f, 4.0f);
        System.out.println("Point p1: " + p1);

        // make movable point
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Before move: " + mp1);

        // move the point
        mp1.move();
        System.out.println("After move: " + mp1);

        mp1.move();
        System.out.println("After moving twice: " + mp1);
    }
}
