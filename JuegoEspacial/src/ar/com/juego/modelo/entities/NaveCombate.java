package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Nave;

public class NaveCombate extends Nave {


    public NaveCombate(double minerales) {
        super();
        this.costoConstruccion(minerales);
    }

    @Override
    public double costoConstruccion(double minerales) {
        if (minerales >= 50)
        minerales = minerales - 50;
        return minerales;
    }

    @Override
    public void viajarHacia(int posX, int posY, int posXuniverso, int posYuniverso) {

    }

    @Override
    public void unirseAFlota() {
        // TODO Auto-generated method stub
    }


}
