class ServidorMinecraft {

    int capacidad = 10;
    String[] nombres = new String[10];
    int[] diamantes = new int[10];
    int cantidadJugadores = 0;

    // a) agregar jugador
    public void agregarJugador(String nombre, int d) {
        if (cantidadJugadores < capacidad) {
            nombres[cantidadJugadores] = nombre;
            diamantes[cantidadJugadores] = d;
            cantidadJugadores++;
            System.out.println("Jugador agregado: " + nombre);
        } else {
            System.out.println("Servidor lleno");
        }
    }

    // b) mostrar stacks de diamantes
    public void mostrarStacks() {
        for (int i = 0; i < cantidadJugadores; i++) {
            int stacks = diamantes[i] / 64;
            System.out.println(nombres[i] + " tiene " + stacks + " stacks de diamantes");
        }
    }

    // c) jugador con más diamantes
    public void jugadorConMasDiamantes() {

        int mayor = diamantes[0];
        String nombreMayor = nombres[0];

        for (int i = 1; i < cantidadJugadores; i++) {
            if (diamantes[i] > mayor) {
                mayor = diamantes[i];
                nombreMayor = nombres[i];
            }
        }

        System.out.println("Jugador con más diamantes: " + nombreMayor);
    }

    // d) total de diamantes
    public void totalDiamantes() {

        int total = 0;

        for (int i = 0; i < cantidadJugadores; i++) {
            total = total + diamantes[i];
        }

        System.out.println("Total de diamantes en el servidor: " + total);
    }
}