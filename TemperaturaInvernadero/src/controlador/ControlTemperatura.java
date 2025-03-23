package controlador;

import modelo.Temperatura;
import modelo.MenorADiezC;
import modelo.EntreDiezVeinticincoC;
import modelo.MayorVeintiCincoC;
import modelo.SensorTiempo;

public class ControlTemperatura {

    public void iniciarSimulacion() {
        while (true) { // Bucle infinito para la simulación
            Temperatura sensor = new Temperatura(); // Genera una nueva temperatura
            int tempActual = sensor.getTemperatura();
            
            // Clases de control de temperatura
            MenorADiezC frio = new MenorADiezC(tempActual);
            EntreDiezVeinticincoC normal = new EntreDiezVeinticincoC(tempActual);
            MayorVeintiCincoC calor = new MayorVeintiCincoC(tempActual);
            
            SensorTiempo sensorTiempo = new SensorTiempo(); // Manejo del tiempo
            sensorTiempo.activarConRetraso(); // Espera 5 segundos

            // Determinar la acción según la temperatura
            if (frio.esFrio()) {
                System.out.println("Temperatura: " + tempActual + "°C - Encendimos el calefactor, estoy quedando tieso del frío...");
            } else if (normal.esTemperaturaNormal()) {
                System.out.println("Temperatura: " + tempActual + "°C - Todo normal en el invernadero.");
            } else if (calor.esCalor()) {
                System.out.println("Temperatura: " + tempActual + "°C - Encendí el ventilador, nadie se aguanta este calor...");
            }
        }
    }
}
