package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Estructura;

public class EstruturaProductiva extends Estructura {


    public EstruturaProductiva(double energia, double minerales) {
        super();
        this.costoConstruccion(energia, minerales);
    }

    @Override
    public void costoConstruccion(double energia, double minerales) {
        if (energia >= 4 && minerales >= 20) {
            minerales = minerales - 20;
            energia = energia - 4;
        } else {
            final String mensaje = "No se puede realizar esta operacion";
            throw new Error(mensaje);
        }
    }
}
