package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Nave;

/**
 * Created by beetoven.desir on 4/6/2017.
 */
public class NaveAsedio extends Nave {


    public NaveAsedio(double minerales, int persona) throws Exception {
        super();
        this.costoConstruccion(minerales, persona);
    }

    @Override
    public void costoConstruccion(double minerales, int persona) throws Exception {
        if (minerales >= 80 && persona >= 40) {
            minerales = minerales - 80;
            persona = persona - 40;
        } else {
            final String mensaje = "No tenie suficiente recurso para realizar esta operacion...";
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
