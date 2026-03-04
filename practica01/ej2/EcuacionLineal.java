public class EcuacionLineal {
    // Atributos privados
    private double a, b, c, d, e, f;

    // Constructor para recibir los 6 valores
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Método para saber si se puede resolver
    public boolean tieneSolucion() {
        // Si (a*d - b*c) es diferente de 0, hay solución
        return (a * d - b * c) != 0;
    }

    // Método para calcular X
    public double getX() {
        double denominador = (a * d - b * c);
        return (e * d - b * f) / denominador;
    }

    // Método para calcular Y
    public double getY() {
        double denominador = (a * d - b * c);
        return (a * f - e * c) / denominador;
    }
}