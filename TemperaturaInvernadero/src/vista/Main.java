package vista;

import controlador.ControlTemperatura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlTemperatura control = new ControlTemperatura();

        while (true) {
            System.out.println("\n🌡️ Bienvenido al Control de Temperatura en el Invernadero");
            System.out.println("🔹 Problema: Un sensor mide la temperatura del invernadero.");
            System.out.println("   - Si la temperatura es menor a 10°C, se activa un calefactor.");
            System.out.println("   - Si está entre 10°C y 25°C, no se hace nada.");
            System.out.println("   - Si es mayor a 25°C, se activa un ventilador.");
            System.out.println("   - La simulación toma lecturas cada 5 segundos.");
            System.out.println("1️⃣ Iniciar la simulación");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    control.iniciarSimulacion();
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
