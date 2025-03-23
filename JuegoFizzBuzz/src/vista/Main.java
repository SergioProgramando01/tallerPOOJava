package vista;

import controlador.JuegoFizzBuzz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JuegoFizzBuzz juego = new JuegoFizzBuzz();

        while (true) {
            System.out.println("\n🟢 Bienvenido al Juego FizzBuzz");
            System.out.println("🔹 Problema: Se recorren los números del 1 al 100. Si es divisible por 3, se imprime 'Fizz'.");
            System.out.println("   Si es divisible por 5, se imprime 'Buzz'. Si es divisible por ambos, 'FizzBuzz'.");
            System.out.println("1️⃣ Resolver el ejercicio");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    juego.jugar();
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
