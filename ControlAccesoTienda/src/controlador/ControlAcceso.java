package controlador;

import modelo.Cliente;
import modelo.Empleado;
import modelo.Tienda;

public class ControlAcceso {
    private Tienda tienda;

    public ControlAcceso() {
        this.tienda = new Tienda();
    }

    public void verificarAcceso(boolean tieneMembresia, boolean esEmpleado) {
        Cliente cliente = new Cliente(tieneMembresia);
        Empleado empleado = new Empleado(esEmpleado);

        if (tienda.permitirAcceso(cliente, empleado)) {
            System.out.println("✅ Acceso PERMITIDO.");
        } else {
            System.out.println("⛔ Acceso DENEGADO.");
        }
    }
}
