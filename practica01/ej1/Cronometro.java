public class Cronometro {
    // a) Atributos privados
    private double inicia;
    private double finaliza;

    // b) Constructor que pone la hora actual al empezar
    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }
    
    // Métodos getter (para obtener los valores)
    public double getInicia() {
        return inicia;
    }

    public double getFinaliza() {
        return finaliza;
    }

    // c) Método para reiniciar el conteo 
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    // d) Método para detener el conteo 
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    // e) Retorna el tiempo que pasó 
    public double lapsoDeTiempo() {
        return finaliza - inicia;
    }
}
