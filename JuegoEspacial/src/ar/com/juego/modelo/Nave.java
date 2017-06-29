/**
 *
 */
package ar.com.juego.modelo;


/**
 * @author beetoven.desir
 */
public abstract class Nave {

    private int puntosDeVida;
    private int modificarVelocidad;

    public Nave() {
        this.puntosDeVida = 100;
        this.modificarVelocidad = 0;
    }

    public abstract double costoConstruccion(double minerales) throws Exception;


    public abstract void viajarHacia(int posX, int posY, int posXuniverso, int posYuniverso);

    public abstract void unirseAFlota();

    @Override
    public String toString() {
        return "Nave{" +
                "puntosDeVida=" + puntosDeVida +
                ", modificarVelocidad=" + modificarVelocidad +
                '}';
    }
}

