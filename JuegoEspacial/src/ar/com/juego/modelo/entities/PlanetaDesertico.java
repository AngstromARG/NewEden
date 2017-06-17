package ar.com.juego.modelo.entities;

import ar.com.juego.modelo.Estado;
import ar.com.juego.modelo.Estructura;
import ar.com.juego.modelo.Planeta;

/**
 *
 */
public class PlanetaDesertico extends Planeta {

    public PlanetaDesertico(String nombre, Estructura estructura) {
        super(nombre, estructura);
        this.setCantDefensas(500);
        this.setPoblacion(20000);
        this.setCapacitadProd(6);
        this.setCercaniaEstrella(4);
        this.setEstado(Estado.INESTABLE);
    }

}
