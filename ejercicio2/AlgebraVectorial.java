package ejercicio2;
public class AlgebraVectorial {
    public boolean perpendicular(Vector a, Vector b) {
        return Math.abs(a.magnitud() + b.magnitud()
                - calcularSuma(a, b)) < 0.0001;
    }
    public boolean perpendicular(Vector a, Vector b, int opcion) {
        return Math.abs(a.productoPunto(b)) < 0.0001;
    }
    public double calcularSuma(Vector a, Vector b) {
        double x = a.getX() + b.getX();
        double y = a.getY() + b.getY();
        double z = a.getZ() + b.getZ();
        return Math.sqrt(x * x + y * y + z * z);
    }
    public boolean perpendicularResta(Vector a, Vector b) {
        double x1 = a.getX() - b.getX();
        double y1 = a.getY() - b.getY();
        double z1 = a.getZ() - b.getZ();
        double x2 = b.getX() - a.getX();
        double y2 = b.getY() - a.getY();
        double z2 = b.getZ() - a.getZ();
        double r1 = Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
        double r2 = Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2);
        return Math.abs(r1 - r2) < 0.0001;
    }
    public boolean perpendicularProducto(Vector a, Vector b) {
        return Math.abs(a.productoPunto(b)) < 0.0001;
    }
    public boolean perpendicularPitagoras(Vector a, Vector b) {
        double suma = calcularSuma(a, b);
        double izquierda = suma * suma;
        double derecha = a.magnitud() * a.magnitud()
                + b.magnitud() * b.magnitud();
        return Math.abs(izquierda - derecha) < 0.0001;
    }
    public boolean paralela(Vector a, Vector b) {
        double producto = a.getX() * b.getY()
                - a.getY() * b.getX();
        double producto2 = a.getX() * b.getZ()
                - a.getZ() * b.getX();
        double producto3 = a.getY() * b.getZ()
                - a.getZ() * b.getY();
        return Math.abs(producto) < 0.0001
                && Math.abs(producto2) < 0.0001
                && Math.abs(producto3) < 0.0001;
    }
    public boolean paralela(Vector a, Vector b, double r) {

        return Math.abs(a.getX() - r * b.getX()) < 0.0001
                && Math.abs(a.getY() - r * b.getY()) < 0.0001
                && Math.abs(a.getZ() - r * b.getZ()) < 0.0001;
    }
    public boolean paralelaProducto(Vector a, Vector b) {
        double x = a.getY() * b.getZ() - a.getZ() * b.getY();
        double y = a.getZ() * b.getX() - a.getX() * b.getZ();
        double z = a.getX() * b.getY() - a.getY() * b.getX();
        return Math.abs(x) < 0.0001
                && Math.abs(y) < 0.0001
                && Math.abs(z) < 0.0001;
    }
    public Vector proyeccion(Vector a, Vector b) {
        double producto = a.productoPunto(b);
        double magnitudB = b.magnitud();
        double factor = producto / (magnitudB * magnitudB);
        return new Vector(
                factor * b.getX(),
                factor * b.getY(),
                factor * b.getZ()
        );
    }
    public double componente(Vector a, Vector b) {

        return a.productoPunto(b) / b.magnitud();
    }
}