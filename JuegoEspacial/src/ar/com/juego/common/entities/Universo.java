package ar.com.juego.common.entities;

import ar.com.juego.modelo.entities.Estrella;


public class Universo {

    private static Universo universo;
    // las distancias
    private final int posX = 2000;
    private final int posY = 2000;
    private final int posLX = -2000;
    private final int posLY = -2000;
    private int posJugador1;
    private int posJugador2;
    private Estrella estrella;

    private Universo() {
        // constructor del universo
    }

    public static Universo getInstance() {
        if (universo == null)
            universo = new Universo();
        return universo;
    }

    public void crearMapa(Jugador[] jugadores) {
        // TODO EN cuando se haya creado la clase juego pasar por parametros los valores de los jugadores. no volver a crear otros..
    }

    // Posicionar las planetas de cada jugador sobre el eje Y;
    public void PosicionarJugador(Jugador[] jugadors) {
        for (int j = 0; j < jugadors.length; j++) {
            if (jugadors[j].getId() == 1) {
                jugadors[j].getPlanetas();
            }
        }
    }

    public int TirarMonedas() {
        return (int) (Math.random() * 9) + 1;
    }

    /**
     * Getters && Setters
     */
    public Estrella getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella estrella) {
        this.estrella = estrella;
    }

}
