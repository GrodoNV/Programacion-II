class Bus {

    int capacidadTotal;
    int pasajeros;
    double precioPasaje;

    // Constructor
    public Bus(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.pasajeros = 0;
        this.precioPasaje = 1.50;
    }

    // a) Subir pasajeros
    public void subirPasajeros(int x) {
        pasajeros = pasajeros + x;
        System.out.println("Subieron " + x + " pasajeros.");
        System.out.println("Total de pasajeros en el bus: " + pasajeros);
    }

    // b) Cobrar pasaje
    public void cobrarPasaje() {
        double total = pasajeros * precioPasaje;
        System.out.println("Total cobrado: Bs " + total);
    }

    // c) Asientos disponibles
    public void asientosDisponibles() {
        int disponibles = capacidadTotal - pasajeros;
        System.out.println("Asientos disponibles: " + disponibles);
    }
}