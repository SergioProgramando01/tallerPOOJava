package controlador;

// Importar clases de los paquetes

import modelo.DivisiblePorAmbos;
import modelo.DivisiblePorCinco;
import modelo.DivisiblePorTres;
import modelo.NumeroUnoAlCien;

public class JuegoFizzBuzz {
    public void jugar() {
        
        //Instanciamos las clases
        
        NumeroUnoAlCien generador = new NumeroUnoAlCien();
        DivisiblePorTres dt = new DivisiblePorTres();
        DivisiblePorCinco dc = new DivisiblePorCinco();
        DivisiblePorAmbos da = new DivisiblePorAmbos();
        
        int numero = generador.generarNumeroAleatorio(); // Generamos número aleatorio

        if (da.esDivisiblePorAmbos(numero)) {
            System.out.println("FizzBuzz");
        } else if (dt.esDivisiblePorTres(numero)) {
            System.out.println("Fizz");
        } else if (dc.esDivisiblePorCinco(numero)) {
            System.out.println("Buzz");
        } else {
            System.out.println(numero);
        }
    }

}