public class PoligonoRegular {

    private int n = 3;
    private double lado = 1;
    private double x = 0;
    private double y = 0;

    public PoligonoRegular() {
    }

    public PoligonoRegular(int n, double lado) {
        this.n = n;
        this.lado = lado;
    }

    public PoligonoRegular(int n, double lado, double x, double y) {
        this.n = n;
        this.lado = lado;
        this.x = x;
        this.y = y;
    }

    public double getPerimetro() {
        return n * lado;
    }

    public double getArea() {
        return (n * lado * lado) / (4 * Math.tan(Math.PI / n));
    }
}