package vista;

import controlador.ControlAcceso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlAcceso control = new ControlAcceso();

        while (true) {
            System.out.println("\n🛒 Bienvenido al Sistema de Control de Acceso a la Tienda");
            System.out.println("🔹 Problema: Solo pueden ingresar clientes con membresía o empleados.");
            System.out.println("   - Acceden clientes con membresía válida dentro del horario de atención.");
            System.out.println("   - También acceden empleados sin importar el horario.");
            System.out.println("1️⃣ Verificar acceso");
            System.out.println("2️⃣ Elegir otro ejercicio");
            System.out.println("3️⃣ Salir");
            System.out.print("🔹 Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("¿Es cliente con membresía? (Sí/No): ");
                    String respuestaMembresia = scanner.next().trim().toLowerCase();
                    boolean tieneMembresia = respuestaMembresia.equals("sí") || respuestaMembresia.equals("si");

                    System.out.print("¿Es empleado de la tienda? (Sí/No): ");
                    String respuestaEmpleado = scanner.next().trim().toLowerCase();
                    boolean esEmpleado = respuestaEmpleado.equals("sí") || respuestaEmpleado.equals("si");

                    control.verificarAcceso(tieneMembresia, esEmpleado);
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
