package ar.com.juego.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beetoven.desir
 */
public abstract class Planeta {

    private String nombre;
    private double poblacion;
    private float capacitadProd;
    private int cantDefensas;
    private int nivel;
    private int cercaniaEstrella;
    private Estado estado;
    private Estructura estructura;
    private List<Nave> naves = new ArrayList<Nave>();

    protected Planeta() {
        this.nombre = null;
        this.cantDefensas = 1000;
        this.capacitadProd = 1000;
        this.nivel = 8;
        this.poblacion = 10000;
        this.estado = Estado.COLONIZADO;
        this.naves = null;
    }

    // Constructor de planeta sin las naves, las naves lo crea el Jugador.
    public Planeta(String nombre, Estructura estructura) {
        this.nombre = nombre;
        this.nivel = 1;
        this.estructura = estructura;
    }

    //	Getters ant Setters
    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public float getCapacitadProd() {
        return capacitadProd;
    }

    public void setCapacitadProd(float capacitadProd) {
        this.capacitadProd = capacitadProd;
    }

    public int getCantDefensas() {
        return cantDefensas;
    }

    public void setCantDefensas(int cantDefensas) {
        this.cantDefensas = cantDefensas;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Estructura getEstructura() {
        return estructura;
    }

    public void setEstructura(Estructura estructura) {
        this.estructura = estructura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCercaniaEstrella() {
        return cercaniaEstrella;
    }

    public void setCercaniaEstrella(int cercaniaEstrella) {
        this.cercaniaEstrella = cercaniaEstrella;
    }

    public List<Nave> getNaves() {
        return naves;
    }

    public void setNaves(Nave nave) {
        this.naves.add(nave);
    }

    @Override
    public String toString() {
        return "Planeta : " +
                "nombre : '" + nombre + '\'' +
                ", poblacion: " + poblacion +
                ", capacitadProd: " + capacitadProd +
                ", cantDefensas: " + cantDefensas +
                ", nivel: " + nivel +
                ", cercaniaEstrella: " + cercaniaEstrella +
                ", estado: " + estado +
                ", estructura: " + estructura +
                ", naves: " + naves;
    }
}
