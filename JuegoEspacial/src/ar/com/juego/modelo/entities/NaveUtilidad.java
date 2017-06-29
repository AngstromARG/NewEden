package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Nave;

/**
 * Created by beetoven.desir on 4/6/2017.
 */
public class NaveUtilidad extends Nave {

    public NaveUtilidad(double minerales) throws Exception {
        super();
        this.costoConstruccion(minerales);
    }

    @Override
    public double costoConstruccion(double minerales) throws Exception {
        if (minerales >= 40) {
            minerales = minerales - 40;

        } else {
            final String mensaje = "No tenes suficiente recursos para realizar esta operacion...";
            throw new Exception(mensaje);
        }
        return minerales;
    }

    @Override
    public void viajarHacia(int posX, int posY, int posXuniverso, int posYuniverso) {

    }

    @Override
    public void unirseAFlota() {

    }
}
