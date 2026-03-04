package practica01.ej3;

public class EcuacionCuadratica {
    // Atributos privados [cite: 130]
    private double a;
    private double b;
    private double c;

    // Constructor [cite: 131]
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // El discriminante: b^2 - 4ac [cite: 133]
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    // Primera raíz [cite: 135]
    public double getRaiz1() {
        double d = getDiscriminante();
        if (d < 0) {
            return 0; 
        }
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    // Segunda raíz [cite: 135]
    public double getRaiz2() {
        double d = getDiscriminante();
        if (d < 0) {
            return 0;
        }
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}