package controlador;

import modelo.Sala;

public class SistemaReservas {
    private Sala sala;

    public SistemaReservas(int capacidad) {
        this.sala = new Sala(capacidad);
    }

    public boolean procesarReserva(int cantidad) {
        return sala.reservarAsientos(cantidad);
    }

    public int obtenerAsientosDisponibles() {
        return sala.getAsientosDisponibles();
    }
}
