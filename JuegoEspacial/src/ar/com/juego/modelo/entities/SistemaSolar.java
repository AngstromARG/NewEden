/**
 *
 */
package ar.com.juego.modelo.entities;

import ar.com.juego.common.entities.Jugador;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beetoven.desir
 */
public class SistemaSolar {

    private String nombre;
    private int estrella;
    private List<Jugador> jugadores = new ArrayList<Jugador>();


    public SistemaSolar() {
        this.nombre = null;
        this.estrella = 1000;
        this.jugadores = null;
    }

    public SistemaSolar(String nombre, int estrella) {
        this.nombre = nombre;
        this.estrella = estrella;
    }

    public SistemaSolar(String nombre, int estrella, List<Jugador> jugadores) {
        super();
        this.nombre = nombre;
        this.estrella = estrella;
        this.jugadores = jugadores;
    }

    /**
     * LLenar la lista de  Planetas por cada Sistema Solar.
     */
    public void crearPlaneta() {
        int cantPlanetas = TirarMonedas();
//		for (int i = 1; i <= cantPlanetas; i++) {
//			if(i==1 || i==2){
//				Planeta planeta =new PlanetaTerrestre(400562, 5, 8, Estado.NUETRO, 8, null);
//				planetas.add(planeta);
//			}else if(i==3 || i==4){
//				Planeta planeta=new PlanetaDesertico(10000, 3, 12, Estado.NUETRO, 7, null);
//				planetas.add(planeta);
//			}if(i==5||i==6){
//				Planeta planeta = new PlanetaVolcanica(5874, 8, 7, Estado.NUETRO, 6, null);
//				planetas.add(planeta);
//			}else if (i==7 || i==8){
//				Planeta planeta = new PlanetaHelado(789425, 15, 20, Estado.NUETRO, 9, null);
//				planetas.add(planeta);
//			}else{
//				Planeta planeta = new PlanetaGaseoso(456321, 9, 14, Estado.NUETRO, 5, null);
//				planetas.add(planeta);
//			}

    }

    public int TirarMonedas() {
        return (int) (Math.random() * 9) + 1;
    }

    /**
     * Getters & Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


}
