public class Juego {
    protected int numeroDeVidas;
    protected int record = 0;
    private final int vidasIniciales;

    public Juego(int vidasIniciales) {
        this.vidasIniciales = vidasIniciales;
        this.numeroDeVidas = vidasIniciales;
    }

    public void reiniciaPartida() {
        this.numeroDeVidas = vidasIniciales;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("Nuevo record: " + record);
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            return true;
        } else {
            System.out.println("Juego Terminado");
            return false;
        }
    }
}
