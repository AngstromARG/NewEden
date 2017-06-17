/**
 *
 */
package ar.com.juego.modelo;

/**
 * @author beetoven.desir
 */
public abstract class Estructura {

    private int puntoDeVida;
    private int capacidadProduccion;
    private int capacidadDefensa;


    public Estructura() {
        this.puntoDeVida = 100;
    }

    public abstract void costoConstruccion(double energia, double minerales);

    public int getPuntoDeVida() {
        return puntoDeVida;
    }

    public void setPuntoDeVida(int puntoDeVida) {
        this.puntoDeVida = puntoDeVida;
    }

    @Override
    public String toString() {
        return "Estructura{" +
                "puntoDeVida=" + puntoDeVida +
                ", capacidadProduccion=" + capacidadProduccion +
                ", capacidadDefensa=" + capacidadDefensa +
                '}';
    }
}
