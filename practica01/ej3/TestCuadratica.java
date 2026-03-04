package practica01.ej3;

import java.util.Scanner;

public class TestCuadratica {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese a, b, c: ");
        double a = lector.nextDouble();
        double b = lector.nextDouble();
        double c = lector.nextDouble();

        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double disc = eq.getDiscriminante();

        // Lógica según el discriminante [cite: 138, 139]
        if (disc > 0) {
            System.out.println("La ecuación tiene dos raíces " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (disc == 0) {
            System.out.println("La ecuación tiene una raíz " + eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
        
        lector.close();
    }
}