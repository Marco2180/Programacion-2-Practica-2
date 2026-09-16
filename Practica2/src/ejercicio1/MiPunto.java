package ejercicio1;
public class MiPunto {
    private double x;
    private double y;
   
    public MiPunto() {
        this.x = 0;
        this.y = 0;
    }
    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double distancia(MiPunto p) {
        return Math.sqrt(
            Math.pow(p.x - this.x, 2) +
            Math.pow(p.y - this.y, 2)
        );
    }
    public double distancia(double x, double y) {
        return Math.sqrt(
            Math.pow(x - this.x, 2) +
            Math.pow(y - this.y, 2)
        );
    }
}