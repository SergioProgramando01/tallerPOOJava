package modelo;

public class MayorVeintiCincoC {  

    private int temperatura;  

    // Constructor vacío
    public MayorVeintiCincoC() {
    }

    // Constructor con parámetro
    public MayorVeintiCincoC(int temperatura) {
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

    // Método que evalúa si la temperatura es mayor a 25 grados
    public boolean esCalor() {
        return temperatura > 25;
    }   
}
