package vista;

import controlador.CalculadoraSimple;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraSimple calculadora = new CalculadoraSimple();

        while (true) {
            System.out.println("\n🟢 Bienvenido a la Calculadora Simple");
            System.out.println("🔹 Problema: Se pide al usuario dos números y una operación (suma, resta, multiplicación o división).");
            System.out.println("   Utiliza condicionales para determinar la operación y permite múltiples cálculos.");
            System.out.println("1️⃣ Resolver el ejercicio");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    calculadora.iniciar();
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
