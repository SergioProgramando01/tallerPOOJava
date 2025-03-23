package modelo;

public class Division { // Nombre de la clase 
    
    private int numero1;
    private int numero2;

    public Division() {
    }

    public Division(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    } 

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Retorna "No es un número" en caso de error
        }
        return (double) numero1 / numero2; // Se convierte a double para obtener decimales
    }    
}
