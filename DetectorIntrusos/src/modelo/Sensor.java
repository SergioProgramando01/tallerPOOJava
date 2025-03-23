package modelo;

import java.util.Random;

public class Sensor {
    private boolean detectaRuido; // Indica si el sensor detecta ruido (true) o no (false)

    // Constructor por defecto: Se inicializa sin detectar ruido
    public Sensor() {
        this.detectaRuido = false;
    }

    // Getter para saber si hay ruido
    public boolean isDetectaRuido() {
        return detectaRuido;
    }

    // Método que simula la detección de ruido (random 0 o 1)
    public void detectarRuido() {
        Random random = new Random();
        this.detectaRuido = random.nextBoolean(); // true (1) o false (0)
    }
}

