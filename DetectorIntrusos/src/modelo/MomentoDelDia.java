package modelo;

public class MomentoDelDia {
    private String momentoDia; // Indica si es "Día" o "Noche"

    // Constructor por defecto
    public MomentoDelDia() {
        this.momentoDia = "Desconocido";
    }

    // Constructor con parámetro
    public MomentoDelDia(int hora) {
        this.momentoDia = analizarMomentoDelDia(hora);
    }

    // Getter para obtener el momento del día
    public String getMomentoDia() {
        return momentoDia;
    }

    // Setter para establecer el momento del día manualmente
    public void setMomentoDia(String momentoDia) {
        this.momentoDia = momentoDia;
    }

    // Método que analiza la hora y determina si es de día o de noche
    public String analizarMomentoDelDia(int hora) {
        if (hora >= 6 && hora < 18) {
            return "Día";
        } else {
            return "Noche";
        }
    }
}

