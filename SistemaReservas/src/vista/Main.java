package vista;

import controlador.SistemaReservas;
import modelo.Usuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n👋 Soy Sergio y te doy la bienvenida");
            System.out.println("🎭 Problema a resolver: Sistema de Reservas");
            System.out.println("\n1️⃣ Resolver ejercicio");
            System.out.println("2️⃣ Volver a elegir un ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("➡️ Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            if (opcion == 1) {
                SistemaReservas sistema = new SistemaReservas(10); // Sala con 10 asientos

                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
                Usuario usuario = new Usuario(nombre);

                while (true) {
                    System.out.println("\n🎟 Asientos disponibles: " + sistema.obtenerAsientosDisponibles());
                    System.out.print(usuario.getNombre() + ", ¿cuántos asientos desea reservar? (0 para salir): ");
                    int cantidad = scanner.nextInt();

                    if (cantidad == 0) {
                        System.out.println("🚪 Saliendo del sistema de reservas...");
                        break;
                    }

                    if (sistema.procesarReserva(cantidad)) {
                        System.out.println("✅ Reserva confirmada. ¡Disfrute la función!");
                    } else {
                        System.out.println("⛔ No hay suficientes asientos disponibles.");
                    }

                    if (sistema.obtenerAsientosDisponibles() == 0) {
                        System.out.println("🏴 La sala está completamente llena.");
                        break;
                    }
                }
            } else if (opcion == 2) {
                System.out.println("🔄 Volviendo al menú principal...");
            } else if (opcion == 3) {
                System.out.println("👋 Gracias por usar el sistema. ¡Hasta luego!");
                break;
            } else {
                System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        }
        
        scanner.close();
    }
}