import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        this.reiniciaPartida();
        Random random = new Random();
        this.numeroAAdivinar = random.nextInt(11); // Entre 0 y 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina un número entre el 0 y el 10:");

        while (true) {
            int intento = scanner.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                this.actualizaRecord();
                break;
            } else {
                if (this.quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor");
                    } else {
                        System.out.println("El número a adivinar es menor");
                    }
                    System.out.println("Inténtalo de nuevo:");
                } else {
                    break;
                }
            }
        }
    }
}
