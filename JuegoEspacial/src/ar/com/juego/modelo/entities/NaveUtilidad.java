package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Nave;

/**
 * Created by beetoven.desir on 4/6/2017.
 */
public class NaveUtilidad extends Nave {

    public NaveUtilidad(double minerales, int persona) throws Exception {
        super();
        this.costoConstruccion(minerales, persona);
    }

    @Override
    public void costoConstruccion(double minerales, int persona) throws Exception {
        if (minerales >= 10 && persona >= 100) {
            minerales = minerales - 10;
            persona = persona - 100;
        } else {
            final String mensaje = "No tenes suficiente recursos para realizar esta operacion...";
            throw new Exception(mensaje);
        }
    }

    @Override
    public void viajarHacia(int posX, int posY, int posXuniverso, int posYuniverso) {

    }

    @Override
    public void unirseAFlota() {

    }
}
