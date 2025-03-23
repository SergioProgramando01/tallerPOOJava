package modelo;

public class MenorADiezC {    

    private int temperatura;

    // Constructor vacío
    public MenorADiezC() {
    }

    // Constructor con parámetro
    public MenorADiezC(int temperatura) {
        this.temperatura = temperatura;
    }

    // Getter
    public int getTemperatura() {
        return temperatura;
    }

    // Setter
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    // Método que evalúa si la temperatura es menor a 10 grados
    public boolean esFrio() {
        return temperatura < 10;
    }    
}

