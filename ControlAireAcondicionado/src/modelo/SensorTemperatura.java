package modelo;

import java.util.Random;

public class SensorTemperatura {
    private int temperatura;

    public void medirTemperatura() {
        Random random = new Random();
        this.temperatura = random.nextInt(15) + 20; // Valores entre 20 y 34
    }

    public int getTemperatura() {
        return temperatura;
    }
}
