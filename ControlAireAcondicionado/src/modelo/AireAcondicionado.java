package modelo;

public class AireAcondicionado {
    private boolean encendido;

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }
}