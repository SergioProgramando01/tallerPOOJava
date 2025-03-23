package modelo;

public class Asiento {
    private boolean ocupado;

    public Asiento() {
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void reservar() {
        this.ocupado = true;
    }
}
