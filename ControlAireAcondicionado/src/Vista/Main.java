package Vista;

import controlador.ControlAire;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlAire sistemaAire = new ControlAire();

        while (true) {
            System.out.println("\n❄️ Bienvenido al Sistema de Control de Aire Acondicionado");
            System.out.println("🔹 Problema: El sistema regula el aire acondicionado.");
            System.out.println("   - Se activa si la temperatura es mayor a 28°C y la humedad mayor al 60%.");
            System.out.println("   - También se activa si la temperatura supera los 30°C sin importar la humedad.");
            System.out.println("   - La simulación tomará lecturas continuamente.");
            System.out.println("1️⃣ Iniciar el control del aire acondicionado");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    sistemaAire.ejecutarSistema();
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
