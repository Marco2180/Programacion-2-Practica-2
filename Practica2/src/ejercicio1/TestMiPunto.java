package ejercicio1;
public class TestMiPunto {

    public static void main(String[] args) {

        
        MiPunto p1 = new MiPunto();
        MiPunto p2 = new MiPunto(10, 30.5);

       
        System.out.println("p1 = (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 = (" + p2.getX() + ", " + p2.getY() + ")");

        
        System.out.printf("Distancia = %.2f\n", p1.distancia(p2));
    }
}