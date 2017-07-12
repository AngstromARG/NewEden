/**
 *
 */
package ar.com.juego.common.entities;

import ar.com.juego.modelo.Estructura;
import ar.com.juego.modelo.Nave;
import ar.com.juego.modelo.Planeta;
import ar.com.juego.modelo.TipoNave;
import ar.com.juego.modelo.entities.*;
import ar.com.juego.observer.Observado;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beetoven.desir
 */
public class Jugador extends Observado {

    Juego juego;
    private int id;
    private int nivel;
    private String nombre;
    private double energia;
    private double mineral;
    private double saldo;
    private int cantPersona;
    private List<Planeta> planetas = new ArrayList<Planeta>();
	private List<Nave> naves;


    public Jugador(String nombre, int id) {
        this.id = ++id;
        this.nombre = nombre;
        this.nivel = 0;
        this.energia = 1000;
        this.mineral = 1000;
        this.saldo = 1000;
        this.cantPersona = 10000;
        this.inicializarJugador();
    }

    public void pasarTurno() {
        System.out.println("Jugador con el turno " + Juego.getTurnoJugador());
        Juego.getJuego().cambiarTurno();
        this.actualizarObservadores();
    }

    // crear Nave
    public void crearNave(TipoNave tipoNave, Planeta planeta) throws Exception {
        // Todo se crea la nave una planeta especifica, depediendo del tipo de naves que quiera el jugador.
        if (tipoNave.equals(TipoNave.combate)) {
            Nave nave = new NaveCombate(this.mineral);
            planeta.setNaves(nave);
            System.out.println("Success... se agrego la nave de combate ");
        } else if (tipoNave.equals(TipoNave.utilidad)) {
            Nave nave = new NaveUtilidad(this.mineral);
            planeta.setNaves(nave);
            System.out.println("Success...Se agrego la nave de utilidad  ");
        } else if (tipoNave.equals(TipoNave.asedio)) {
            Nave nave = new NaveAsedio(this.mineral);
            planeta.setNaves(nave);
            System.out.println("Success... se agrego la nave de Asedio");
        }

    }

    //Se inicializar el jugador con 2 planetas y estrutura difererentes
    public void inicializarJugador() {
        Estructura torreta = new EstructuraTorreta(this.energia, this.mineral);
        Planeta planeta = new PlanetaTerrestre("Tierra", torreta);
        this.planetas.add(planeta);
        Estructura productiva = new EstruturaProductiva(this.energia, this.mineral);
        Planeta planet = new PlanetaDesertico("Desierto", productiva);
        this.planetas.add(planet);
        //Recorremos las planetas.
        for (Planeta p : planetas) {
            p.toString();
        }
    }

    public void conformarFlota() {

    }

    public List<Nave> enviarFlota() {
    	naves = null;
    	for (Planeta planeta:this.planetas) {
    		if(planeta.getNaves()!=null)
    			naves.addAll(planeta.getNaves());
    	}
		return naves;
    }

    public void quitarNave() {

    }
    
    
    /**
     * getters and setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCantPersona() {
        return cantPersona;
    }

    public void setCantPersona(int cantPersona) {
        this.cantPersona = cantPersona;
    }

    public List<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlaneta(Planeta planeta) {
        this.planetas.add(planeta);
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getMineral() {
        return mineral;
    }

    public void setMineral(double mineral) {
        this.mineral = mineral;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", id=" + id + ", nivel=" + nivel + ", energia=" + energia + ", mineral="
                + mineral + ", saldo=" + saldo + ", cantPersona=" + cantPersona + ", planetas=" + planetas + "]";
    }

}
