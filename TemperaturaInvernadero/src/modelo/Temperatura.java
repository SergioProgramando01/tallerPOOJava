package modelo;

import java.util.Random;

public class Temperatura {

    private int temperatura;

    // Constructor que inicializa una temperatura aleatoria
    public Temperatura() {
        this.temperatura = generarTemperatura();
    }

    // Método que genera una temperatura aleatoria entre -5 y 35 grados
    public int generarTemperatura() {
        Random random = new Random();
        return random.nextInt(41) - 5; // Genera un número entre -5 y 35
    }

    // Getter para obtener la temperatura actual
    public int getTemperatura() {
        return temperatura;
    }

    // Setter para cambiar la temperatura (opcional)
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
