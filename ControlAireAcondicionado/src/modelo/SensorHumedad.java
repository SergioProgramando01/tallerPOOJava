package modelo;

import java.util.Random;

public class SensorHumedad {
    private int humedad;

    public void medirHumedad() {
        Random random = new Random();
        this.humedad = random.nextInt(41) + 40; // Valores entre 40 y 80
    }

    public int getHumedad() {
        return humedad;
    }
}
