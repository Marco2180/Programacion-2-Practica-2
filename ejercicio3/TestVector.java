package ejercicio3;
public class TestVector {
    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(4, 5, 6);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("suma = " + a.suma(b));
        System.out.println("multiplicacion = " + a.producto(2));
        System.out.println("longitud de a = " + a.longitud());
        System.out.println("normal de a = " + a.normal());
        System.out.println("producto escalar = " + a.producto(b));
        System.out.println("producto vectorial = "
                + a.productoVectorial(b));
    }
}