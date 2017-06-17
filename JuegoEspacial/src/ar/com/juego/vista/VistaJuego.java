/**
 *
 */
package ar.com.juego.vista;


import ar.com.juego.common.entities.Juego;
import ar.com.juego.common.entities.Jugador;
import ar.com.juego.modelo.TipoNave;
import ar.com.juego.observer.IObserver;

/**
 * @author Beetoven Desir
 */
public class VistaJuego implements IObserver {


    private Jugador jugador;


    public VistaJuego(Jugador[] jugadores) {
        Juego.getInstance(jugadores);
        Juego.getJuego().inicializar();
    }

    public void crearNaves(TipoNave tipoNave) {
        // jugador.crearNave();
        System.out.println("Creando la nave¡¡¡ ");
    }

    public void enviarFlota() {
        System.out.println("Enviando flota¡¡¡ ");
    }

    public void atacarPlaneta() {
        System.out.println("Atacando planeta enemiga. ");

    }

    public void crearPlaneta() {
        System.out.println("Creando planeta");
    }

    @Override
    public void actualizar() {

    }
}
