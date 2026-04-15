public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (super.validaNumero(n) && n % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: El número debe ser par y estar entre 0 y 10.");
            return false;
        }
    }
}
