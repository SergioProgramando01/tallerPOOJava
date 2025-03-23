package vista;

import controlador.DetectorIntrusos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DetectorIntrusos detector = new DetectorIntrusos();

        while (true) {
            System.out.println("\n🚨 Bienvenido al Sistema de Detección de Intrusos");
            System.out.println("🔹 Problema: El sistema tiene 3 sensores de movimiento.");
            System.out.println("   - Si al menos 2 sensores detectan movimiento y es de noche, se activa la alarma.");
            System.out.println("   - La simulación toma lecturas en un bucle.");
            System.out.println("   - Se puede activar o desactivar la alarma manualmente.");
            System.out.println("1️⃣ Iniciar la detección de intrusos");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    detector.iniciarSistema();
                    break;
                case 2:
                    System.out.println("🔄 Volviendo al menú de ejercicios...");
                    return; // Se puede conectar con otro menú principal
                case 3:
                    System.out.println("🚪 Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❌ Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
