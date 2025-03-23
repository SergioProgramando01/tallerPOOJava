package modelo;

import java.util.Scanner;

//Clase que me permite ingresar número de consola

public class Numero {
    
public int solicitarNumero() {
    Scanner scanner = new Scanner(System.in); // Solicita número consola
    int numero = scanner.nextInt(); // Guarda en variable
    return numero; //Retornamos el número guardado
}

}
