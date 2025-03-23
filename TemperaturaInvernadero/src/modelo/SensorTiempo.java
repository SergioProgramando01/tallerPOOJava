package modelo;

public class SensorTiempo {

    private boolean estado;

    // Constructor que inicia el estado en false
    public SensorTiempo() {
        this.estado = false;
    }

    // Getter para obtener el estado actual
    public boolean isEstado() {
        return estado;
    }

    // Método que espera 5 segundos y cambia el estado a true
    public void activarConRetraso() {
        try {
            Thread.sleep(5000); // Espera 5 segundos (5000 milisegundos)
            estado = true;
        } catch (InterruptedException e) {
            System.out.println("Error en la espera: " + e.getMessage());
        }
    }
}

