public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("--- Juego Adivina Número ---");
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        juego1.juega();

        System.out.println("\n--- Juego Adivina Par ---");
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        juego2.juega();

        System.out.println("\n--- Juego Adivina Impar ---");
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        juego3.juega();
    }
}
