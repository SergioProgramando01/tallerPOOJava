package modelo;

public class DivisiblePorCinco {
    
    private int numero;

    public DivisiblePorCinco() {
    }

    public DivisiblePorCinco(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }    

    public boolean esDivisiblePorCinco(int numero) {
        return numero % 5 == 0;
    }   

}
