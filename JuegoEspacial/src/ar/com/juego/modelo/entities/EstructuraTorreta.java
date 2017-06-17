/**
 *
 */
package ar.com.juego.modelo.entities;


import ar.com.juego.modelo.Estructura;

/**
 * @author beetoven.desir
 */
public class EstructuraTorreta extends Estructura {

    public EstructuraTorreta(double energia, double minerales) {
        super();
        this.costoConstruccion(energia, minerales);
    }

    @Override
    public void costoConstruccion(double energia, double minerales) {
        if (energia >= 10 && minerales >= 8) {
            minerales = minerales - 8;
            energia = energia - 10;
        } else {
            final String mensaje = "No se puede realizar esta operacion";
            throw new Error(mensaje);
        }
    }
}
