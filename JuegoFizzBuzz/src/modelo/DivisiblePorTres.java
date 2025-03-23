package modelo;

public class DivisiblePorTres {
    
    int numero;

    public DivisiblePorTres() {
    }

    public DivisiblePorTres(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }    
    
    public boolean esDivisiblePorTres(int numero) {
    return numero % 3 == 0;
    }
}
