package modelo;

public class EntreDiezVeinticincoC {
    
    private int temperatura;

    // Constructor vacío
    public EntreDiezVeinticincoC() {
    }

    // Constructor con parámetro
    public EntreDiezVeinticincoC(int temperatura) {
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

    // Método que evalúa si la temperatura está entre 10 y 25 grados
    public boolean esTemperaturaNormal() {
        return temperatura >= 10 && temperatura <= 25;
    }    
}

