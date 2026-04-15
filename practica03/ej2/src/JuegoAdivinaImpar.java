public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (super.validaNumero(n) && n % 2 != 0) {
            return true;
        } else {
            System.out.println("Error: El número debe ser impar y estar entre 0 y 10.");
            return false;
        }
    }
}
