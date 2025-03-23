
package modelo;

public class DivisiblePorAmbos {
    private int numero;

    public DivisiblePorAmbos() {
    }

    public DivisiblePorAmbos(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }    

    public boolean esDivisiblePorAmbos(int numero) {
        return numero % 3 == 0 && numero % 5 == 0;
    }
}

