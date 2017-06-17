package ar.com.juego.common.entities;


public class Juego {

    private static int contadorTurno = 0;
    private static int turnoJugador;
    private static Juego juego;
    private Jugador[] jugadores;

    private Juego(Jugador[] jugadores) {
        this.jugadores = jugadores;
        Universo.getInstance();
    }

    // Instancia de la clase
    public static Juego getInstance(Jugador[] jugadores) {
        if (juego == null) {
            juego = new Juego(jugadores);
        }
        return juego;
    }

    public static int tirarMonedas() {
        return (int) (Math.random() * 2) + 1;
    }

    public static int getTurnoJugador() {
        return turnoJugador;
    }

    public static void setTurnoJugador(int turnoJugador) {
        Juego.turnoJugador = turnoJugador;
    }

    public static Juego getJuego() {
        return juego;
    }

    public static void setJuego(Juego juego) {
        Juego.juego = juego;
    }

    // Inicializar el juego....
    public void inicializar() {
        int i = tirarMonedas();
        System.out.println(i);
        for (Jugador j : jugadores) {
            if (j.getId() == i) {
                turnoJugador = j.getId();
            }
        }
        System.out.println("El primer turno pertenece el Jugador " + turnoJugador);
    }

    public void cambiarTurno() {
        if (turnoJugador == jugadores[0].getId()) {
            turnoJugador = jugadores[1].getId();
        } else {
            turnoJugador = jugadores[0].getId();
        }
        System.out.println("se cambio el turno al Jugador " + turnoJugador);
    }

    /**
     * Getters and Setters
     */
    public int getContadorTurno() {
        return contadorTurno;
    }

    public static void setContadorTurno(int contadorTurno) {
        Juego.contadorTurno = contadorTurno;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
}
