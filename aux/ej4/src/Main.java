public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus(30); // bus con 30 asientos

        bus1.subirPasajeros(12);   // suben 12 pasajeros
        bus1.cobrarPasaje();      // cobrar pasaje
        bus1.asientosDisponibles(); // mostrar asientos libres

    }

}