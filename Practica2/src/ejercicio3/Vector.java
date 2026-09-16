package ejercicio3;
public class Vector {
    private double a1;
    private double a2;
    private double a3;
    public Vector() {
        this.a1 = 0;
        this.a2 = 0;
        this.a3 = 0;
    }
    public Vector(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    public Vector suma(Vector o) {
        double x = this.a1 + o.a1;
        double y = this.a2 + o.a2;
        double z = this.a3 + o.a3;
        return new Vector(x, y, z);
    }
    public Vector producto(double m) {
        double x = m * this.a1;
        double y = m * this.a2;
        double z = m * this.a3;
        return new Vector(x, y, z);
    }
    public double producto(Vector o) {
        double resultado = this.a1 * o.a1
                         + this.a2 * o.a2
                         + this.a3 * o.a3;
        return resultado;
    }
    public double longitud() {
        double resultado = Math.sqrt(
                this.a1 * this.a1
              + this.a2 * this.a2
              + this.a3 * this.a3
        );
        return resultado;
    }
    public Vector normal() {
        double l = this.longitud();
        if (l == 0) {
            return new Vector();
        }
        double x = this.a1 / l;
        double y = this.a2 / l;
        double z = this.a3 / l;
        return new Vector(x, y, z);
    }
    public Vector productoVectorial(Vector o) {
        double x = this.a2 * o.a3 - this.a3 * o.a2;
        double y = this.a3 * o.a1 - this.a1 * o.a3;
        double z = this.a1 * o.a2 - this.a2 * o.a1;
        return new Vector(x, y, z);
    }
    public boolean equals(Object o) {
        if (o instanceof Vector) {
            Vector v = (Vector) o;

            return v.a1 == this.a1
                && v.a2 == this.a2
                && v.a3 == this.a3;
        } else {
            return false;
        }
    }
    public String toString() {
        return String.format(
                "(%.2f, %.2f, %.2f)",
                this.a1, this.a2, this.a3
        );
    }
}
