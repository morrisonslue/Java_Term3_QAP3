public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // constructors
    public Point() {
    }

    // x and y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // get x
    public float getX() {
        return x;
    }

    // set x
    public void setX(float x) {
        this.x = x;
    }

    // get y
    public float getY() {
        return y;
    }

    // set y
    public void setY(float y) {
        this.y = y;
    }

    // set x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // output
    // get x and y in array
    public float[] getXY() {
        float[] xy = { x, y };
        return xy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
