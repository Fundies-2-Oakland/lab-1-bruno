package Main;

public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%1$.2f, %2$.2f, %3$.2f)", x, y, z);
    }

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(2.4, 2.3, 5.4);

        System.out.println(vector);
    }
}
