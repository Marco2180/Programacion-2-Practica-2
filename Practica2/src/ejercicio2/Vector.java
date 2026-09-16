package ejercicio2;
public class Vector {
    private double x;
    private double y;
    private double z;
    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Vector(double x, double y, double z) {
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
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double productoPunto(Vector b) {
        return x * b.x + y * b.y + z * b.z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}