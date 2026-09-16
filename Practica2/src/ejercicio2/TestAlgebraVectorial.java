package ejercicio2;
public class TestAlgebraVectorial {
    public static void main(String[] args) {
        Vector a = new Vector(3, 4, 0);
        Vector b = new Vector(4, -3, 0);
        AlgebraVectorial algebra = new AlgebraVectorial();
        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);
        System.out.println();
        System.out.println("a) Perpendicular:");
        System.out.println(algebra.perpendicular(a, b, 1));
        System.out.println("b) Perpendicular por resta:");
        System.out.println(algebra.perpendicularResta(a, b));
        System.out.println("c) Producto punto:");
        System.out.println(algebra.perpendicularProducto(a, b));
        System.out.println("d) Teorema de Pitagoras:");
        System.out.println(algebra.perpendicularPitagoras(a, b));
        System.out.println("e) Paralela:");
        System.out.println(algebra.paralela(a, b));
        System.out.println("f) Producto vectorial:");
        System.out.println(algebra.paralelaProducto(a, b));
        System.out.println("g) Proyeccion de a sobre b:");
        System.out.println(algebra.proyeccion(a, b));
        System.out.println("h) Componente de a en b:");
        System.out.println(algebra.componente(a, b));
    }
}