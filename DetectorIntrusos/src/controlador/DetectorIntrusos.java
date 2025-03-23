package controlador;

import modelo.Sensor;
import modelo.Alarma;
import java.util.Scanner;

public class DetectorIntrusos {
    private Sensor sensor1;
    private Sensor sensor2;
    private Sensor sensor3;
    private Alarma alarma;

    public DetectorIntrusos() {
        this.sensor1 = new Sensor();
        this.sensor2 = new Sensor();
        this.sensor3 = new Sensor();
        this.alarma = new Alarma();
    }

    public void iniciarSistema() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DEL SISTEMA DE SEGURIDAD ===");
            System.out.println("1. Activar/Desactivar alarma");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cambiarEstadoAlarma();
                    break;
                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 2);

        scanner.close();
    }

    private void cambiarEstadoAlarma() {
        if (alarma.isEstado()) {
            alarma.apagar();
            System.out.println("🚨 Alarma DESACTIVADA.");
        } else {
            alarma.encender();
            System.out.println("🚨 Alarma ACTIVADA. Simulando detección de movimientos...");
            simularDeteccion();
        }
    }

    private void simularDeteccion() {
        for (int i = 0; i < 5; i++) { // Simula 5 lecturas de los sensores
            sensor1.detectarRuido();
            sensor2.detectarRuido();
            sensor3.detectarRuido();

            int sensoresActivos = (sensor1.isDetectaRuido() ? 1 : 0) + 
                                  (sensor2.isDetectaRuido() ? 1 : 0) + 
                                  (sensor3.isDetectaRuido() ? 1 : 0);

            if (sensoresActivos >= 2) {
                System.out.println("¡Alarma ACTIVADA! ");
            } else {
                System.out.println("¡Alarma DESACTIVADA! ");
            }

            try {
                Thread.sleep(2000); // Pausa de 2 segundos entre simulaciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
