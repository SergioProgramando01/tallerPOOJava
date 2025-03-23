package controlador;

import modelo.AireAcondicionado;
import modelo.SensorTemperatura;
import modelo.SensorHumedad;

public class ControlAire {
    private AireAcondicionado aire;
    private SensorTemperatura sensorTemperatura;
    private SensorHumedad sensorHumedad;

    public ControlAire() {
        this.aire = new AireAcondicionado();
        this.sensorTemperatura = new SensorTemperatura();
        this.sensorHumedad = new SensorHumedad();
    }

    public void ejecutarSistema() {
        while (true) {
            sensorTemperatura.medirTemperatura();
            sensorHumedad.medirHumedad();

            int temp = sensorTemperatura.getTemperatura();
            int humedad = sensorHumedad.getHumedad();

            if ((temp > 28 && humedad > 60) || temp > 30) {
                aire.encender();
                System.out.println("🌡️ Temp: " + temp + "°C | 💧 Humedad: " + humedad + "% -> ❄️ Aire ENCENDIDO.");
            } else {
                aire.apagar();
                System.out.println("🌡️ Temp: " + temp + "°C | 💧 Humedad: " + humedad + "% -> ❄️ Aire APAGADO.");
            }

            try {
                Thread.sleep(5000); // Espera 5 segundos antes de la siguiente lectura
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
