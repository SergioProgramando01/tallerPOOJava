package modelo;

public class Cliente {
    private boolean tieneMembresia;

    public Cliente(boolean tieneMembresia) {
        this.tieneMembresia = tieneMembresia;
    }

    public boolean isTieneMembresia() {
        return tieneMembresia;
    }
}