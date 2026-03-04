public class TestCronometro {
    public static void main(String[] args) {
        // Creamos una lista de 10,000 números
        int n = 10000;
        int[] lista = new int[n];
        
        // Llenamos la lista con números al revés para que le cueste ordenar
        for (int i = 0; i < n; i++) {
            lista[i] = n - i;
        }

        // Usamos nuestra clase
        Cronometro miReloj = new Cronometro();
        
        System.out.println("Ordenando números...");
        
        miReloj.inicia(); // Empezamos a contar
        
        // Ordenación por Selección (Selection Sort) 
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minimo]) {
                    minimo = j;
                }
            }
            // Intercambio de valores
            int auxiliar = lista[minimo];
            lista[minimo] = lista[i];
            lista[i] = auxiliar;
        }
        
        miReloj.detener(); // Paramos el reloj
        
        System.out.println("El tiempo que tardó fue: " + miReloj.lapsoDeTiempo() + " milisegundos.");
    }
}