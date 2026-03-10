public class Main {

    public static void main(String[] args) {

        ServidorMinecraft servidor = new ServidorMinecraft();

        servidor.agregarJugador("Steve", 120);
        servidor.agregarJugador("Alex", 64);
        servidor.agregarJugador("Juan", 30);
        servidor.agregarJugador("Pedro", 200);

        servidor.mostrarStacks();
        servidor.jugadorConMasDiamantes();
        servidor.totalDiamantes();
    }

}