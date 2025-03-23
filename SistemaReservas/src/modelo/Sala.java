package modelo;

public class Sala {
    private Asiento[] asientos;

    public Sala(int capacidad) {
        asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento();
        }
    }

    public int getAsientosDisponibles() {
        int disponibles = 0;
        for (Asiento asiento : asientos) {
            if (!asiento.isOcupado()) {
                disponibles++;
            }
        }
        return disponibles;
    }

    public boolean reservarAsientos(int cantidad) {
        if (cantidad > getAsientosDisponibles()) {
            return false; // No hay suficientes asientos
        }

        int reservados = 0;
        for (Asiento asiento : asientos) {
            if (!asiento.isOcupado()) {
                asiento.reservar();
                reservados++;
            }
            if (reservados == cantidad) break;
        }
        return true; // Reserva exitosa
    }
}
