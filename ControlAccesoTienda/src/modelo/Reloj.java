package modelo;

import java.time.LocalTime;

public class Reloj {
    public boolean estaDentroDelHorario() {
        LocalTime ahora = LocalTime.now();
        LocalTime apertura = LocalTime.of(8, 0);  // 08:00 AM
        LocalTime cierre = LocalTime.of(22, 0);   // 10:00 PM

        return !ahora.isBefore(apertura) && !ahora.isAfter(cierre);
    }
}
