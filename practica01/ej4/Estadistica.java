package practica01.ej4;

public class Estadistica {
    // Atributo para guardar los números
    private double[] números;

    // Constructor que recibe el arreglo de números
    public Estadistica(double[] números) {
        this.números = números;
    }

    // Método para calcular el promedio [cite: 156]
    public double promedio() {
        double suma = 0;
        for (int i = 0; i < números.length; i++) {
            suma = suma + números[i];
        }
        return suma / números.length;
    }

    // Método para calcular la desviación estándar [cite: 157]
    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        
        for (int i = 0; i < números.length; i++) {
            // (xi - promedio)^2
            double diferencia = números[i] - prom;
            sumaCuadrados = sumaCuadrados + (diferencia * diferencia);
        }
        
        // Raíz cuadrada de (suma / n-1) [cite: 154]
        return Math.sqrt(sumaCuadrados / (números.length - 1));
    }
}