package controlador;

import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.Suma;
import modelo.Resta;
import modelo.Multiplicacion;
import modelo.Division;

public class CalculadoraSimple {
    
    private int numero1;
    private int numero2;
    private String operacion;
    private Scanner scanner;

    public CalculadoraSimple() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar números con validación
                System.out.print("Ingrese el primer número: ");
                numero1 = scanner.nextInt(); 

                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextInt(); 
                
                // Limpiar buffer
                scanner.nextLine();

                // Solicitar operación
                System.out.print("Ingrese la operación (+, -, *, /) o 'salir' para terminar: ");
                operacion = scanner.nextLine();

                if (operacion.equalsIgnoreCase("salir")) {
                    continuar = false;
                    break;
                }

                // Determinar la operación
                switch (operacion) {
                    case "+":
                        Suma suma = new Suma(numero1, numero2);
                        System.out.println("Resultado: " + suma.sumar());
                        break;
                    case "-":
                        Resta resta = new Resta(numero1, numero2);
                        System.out.println("Resultado: " + resta.restar());
                        break;
                    case "*":
                        Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);
                        System.out.println("Resultado: " + multiplicacion.multiplicar());
                        break;
                    case "/":
                        Division division = new Division(numero1, numero2);
                        System.out.println("Resultado: " + division.dividir());
                        break;
                    case "salir":
                        break;
                    default:
                        System.out.println("Operación no válida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        System.out.println("Calculadora finalizada.");
    }
}
