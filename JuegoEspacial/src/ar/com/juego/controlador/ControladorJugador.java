package ar.com.juego.controlador;

import ar.com.juego.common.entities.Juego;
import ar.com.juego.common.entities.Jugador;
import ar.com.juego.modelo.Planeta;
import ar.com.juego.modelo.TipoNave;
import ar.com.juego.modelo.entities.PlanetaTerrestre;

/**
 * Created by beetoven.desir on 21/6/2017.
 */
public class ControladorJugador {

	public static boolean full = false;
	private Jugador[] jugadores;
	private Juego juego;

	public ControladorJugador() {
		jugadores = new Jugador[2];
		this.juego = Juego.getInstance(jugadores);
	}

	public static void jugad() {

	}

	// este va en el otro controlador...
	public void agregarJugador(String nombre, int id) throws Exception {

		if (this.jugadores[0] == null && id == 0) {
			this.jugadores[0] = new Jugador(nombre, id);
		} else if (this.jugadores[1] == null && id == 1) {
			this.jugadores[1] = new Jugador(nombre, id);
			full = true;
		} else {
			throw new Error("Deja de ingresar jugadores.... solo se admite 2 jugadores");
		}
		this.juego.setJugadores(this.jugadores);
	}

	public void agregarNave(TipoNave tipoNave, Planeta planeta) {

		for (Jugador jugador : this.jugadores) {
			Planeta planet = new PlanetaTerrestre("Planeta", null);
			if (jugador.getId() == Juego.getTurnoJugador()) {
				try {
					jugador.crearNave(tipoNave, planet);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	public Jugador[] getJugadors() {
		return jugadores;
	}

	public void setJugadors(Jugador[] jugadors) {
		this.jugadores = jugadors;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
}
