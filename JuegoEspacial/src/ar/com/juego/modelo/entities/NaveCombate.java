package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Nave;

public class NaveCombate extends Nave {


    public NaveCombate(double minerales, int persona) {
        super();
        this.costoConstruccion(minerales, persona);
    }

    @Override
    public void costoConstruccion(double minerales, int persona) {
        minerales = minerales - 50;
        persona = persona - 10;
    }

    @Override
    public void viajarHacia(int posX, int posY, int posXuniverso, int posYuniverso) {

    }

    @Override
    public void unirseAFlota() {
        // TODO Auto-generated method stub
    }


}
