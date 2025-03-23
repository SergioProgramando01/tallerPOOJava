package modelo;
import java.util.Random;


public class NumeroUnoAlCien {
    
public int generarNumeroAleatorio() {
    Random numero = new Random(); // Instancia de Random
    return numero.nextInt(100) + 1; //Retorno de un número del 1 al 100
}    

}
