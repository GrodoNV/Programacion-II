package practica01.ej4;

import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] misNumeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            misNumeros[i] = lector.nextDouble();
        }

        // Creamos el objeto con los datos
        Estadistica est = new Estadistica(misNumeros);

        // Mostramos resultados [cite: 162, 163]
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviación estándar es " + est.desviacion());
        
        lector.close();
    }
}