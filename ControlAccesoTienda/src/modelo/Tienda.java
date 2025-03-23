package modelo;

public class Tienda {
    private Reloj reloj;

    public Tienda() {
        this.reloj = new Reloj();
    }

    public boolean permitirAcceso(Cliente cliente, Empleado empleado) {
        boolean horarioValido = reloj.estaDentroDelHorario();
        boolean tieneMembresia = cliente.isTieneMembresia();
        boolean esEmpleado = empleado.isEsEmpleado();

        return (tieneMembresia && horarioValido) || esEmpleado;
    }
}
