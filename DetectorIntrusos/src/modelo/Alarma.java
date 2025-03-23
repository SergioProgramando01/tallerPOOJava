package modelo;

public class Alarma {
    private boolean estado; // Indica si la alarma está encendida (true) o apagada (false)

    // Constructor por defecto (alarma apagada por defecto)
    public Alarma() {
        this.estado = false;
    }

    // Constructor con parámetro
    public Alarma(boolean estado) {
        this.estado = estado;
    }

    // Getter para obtener el estado de la alarma
    public boolean isEstado() {
        return estado;
    }

    // Setter para cambiar el estado de la alarma
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Método para encender la alarma
    public void encender() {
        this.estado = true;
    }

    // Método para apagar la alarma
    public void apagar() {
        this.estado = false;
    }
}
